package com.multithreading;

import java.util.LinkedList;
import java.util.List;

class SupplyChain{

    List<Integer> eventList = new LinkedList<>();
    private static int MAX_SIZE = 5;
    private static int MIN_SIZE = 0;
    private Object intrinsicLock = new Object();
    int value = 0;

    public void produce() throws InterruptedException {
        synchronized (intrinsicLock){
            while (true){
                if (eventList.size() == MAX_SIZE){
                    System.out.println("Waiting for event to be consumed.");
                    intrinsicLock.wait();
                } else{
                    System.out.println("Adding event." +value);
                    eventList.add(++value);
                    intrinsicLock.notify();
                }
            }
        }

    }

    public void consume() throws InterruptedException {
        synchronized (intrinsicLock){
            while (true){
                if (eventList.size() == MIN_SIZE){
                    System.out.println("Waiting for event to be produced.");
                    intrinsicLock.wait();
                } else{
                    System.out.println("Removing event."+eventList.remove(--value));
                    intrinsicLock.notify();
                }
            }
        }

    }

}

public class ProducerConsumerUsingWaitAndNotify {

    public static void main(String[] args) {
        SupplyChain supplyChain = new SupplyChain();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    supplyChain.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    supplyChain.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

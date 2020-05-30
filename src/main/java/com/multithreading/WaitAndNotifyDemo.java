package com.multithreading;

class Processor{

    public void produce() throws InterruptedException {
        synchronized (this){
            System.out.println("Producing events....");
            wait();
            System.out.println("Production is completed");
        }
    }

    public void consume() throws InterruptedException {
        synchronized (this){
            Thread.sleep(1000);
            System.out.println("Consuming events....");
            notify();
        }
    }
}

public class WaitAndNotifyDemo {

    public static void main(String[] args) {
        Processor processor = new Processor();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    processor.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    processor.consume();
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

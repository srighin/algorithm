package com.multithreading;

class TwoCounter{
    public int counter1=0;
    public int counter2=0;

    public Object lock1 = new Object();
    public Object lock2 = new Object();

    public void incrementCounter1(){
        synchronized (lock1){
            counter1++;
        }
    }
    public void incrementCounter2(){
        synchronized (lock2){
            counter2++;
        }
    }

    public void process(){
        for (int i=0;i<100; i++){
            incrementCounter1();
            incrementCounter2();
        }
    }
}

public class SyncroniseBlockDemo {
    public static void main(String[] args) {
        TwoCounter twoCounter = new TwoCounter();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                twoCounter.process();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                twoCounter.process();
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
        System.out.println("Counter 1:: "+twoCounter.counter1+" Counter 2:: "+twoCounter.counter2);
    }
}

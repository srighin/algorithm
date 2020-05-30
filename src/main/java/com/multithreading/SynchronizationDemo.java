package com.multithreading;

class ProgramCounter implements Runnable{

    private int counter;

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public ProgramCounter(int counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i=0; i<10000; i++){
            increment();
        }
    }
    private synchronized void increment(){
        counter++;
    }
}

public class SynchronizationDemo {
    public static void main(String[] args) {

        int counter = 0;
        ProgramCounter programCounter = new ProgramCounter(counter);

        Thread t1 = new Thread(programCounter);
        Thread t2 = new Thread(programCounter);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(programCounter.getCounter());
    }
}

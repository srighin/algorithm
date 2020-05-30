package com.multithreading;

class Worker implements Runnable{
    private volatile boolean processed;

    @Override
    public void run() {
        while (!isProcessed()){
            System.out.println("Processing");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean isProcessed() {
        return processed;
    }

    public void setProcessed(boolean processed) {
        this.processed = processed;
    }
}

public class VolatileDemo {

    public static void main(String[] args) {
        Worker worker = new Worker();
        Thread thread = new Thread(worker);

        thread.start();
        try {
            Thread.sleep(1000);
            worker.setProcessed(true);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Worker Process is completed...");
    }
}

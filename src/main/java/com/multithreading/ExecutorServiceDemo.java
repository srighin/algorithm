package com.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class FixedThreadPoolWorker implements Runnable{

    @Override
    public void run() {
        for (int i=0; i<5; i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

public class ExecutorServiceDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i=0; i<5; i++){
            executorService.submit(new FixedThreadPoolWorker());
        }
    }
}

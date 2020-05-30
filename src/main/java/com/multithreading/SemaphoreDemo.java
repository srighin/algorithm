package com.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

enum Downloader{
    INSTANCE;

    private Semaphore semaphore = new Semaphore(3, true);

    public void download() throws InterruptedException {
        semaphore.acquire();
        System.out.println("Downloading the file...");
        Thread.sleep(2000);
        semaphore.release();
    }
 }

public class SemaphoreDemo {
    public static void main(String[] args) throws InterruptedException {
        Downloader downloader = Downloader.INSTANCE;

        ExecutorService service = Executors.newCachedThreadPool();

        for (int i=0; i<12; i++){
            service.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        downloader.download();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }

        service.awaitTermination(1000, TimeUnit.MILLISECONDS);
    }
}

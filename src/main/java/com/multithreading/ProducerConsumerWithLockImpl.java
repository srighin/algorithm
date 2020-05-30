package com.multithreading;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class WorkerLock{

    Lock lock = new ReentrantLock();
    Condition condition = lock.newCondition();

    public void producer() throws InterruptedException {
        lock.lock();

        try{
            System.out.println("producer is initiated");
            condition.await();
            System.out.println("producer completed the task");
        }finally {
            lock.unlock();
        }

    }

    public void consumer() throws InterruptedException {
        lock.lock();
        try{
            Thread.sleep(200);
            System.out.println("Consumer completed the task");
            condition.signal();
        }finally {
            lock.unlock();
        }
    }
}

public class ProducerConsumerWithLockImpl {
    public static void main(String[] args) {
        WorkerLock workerLock = new WorkerLock();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    workerLock.producer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    workerLock.consumer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();

    }
}

package com.multithreading;

class Runner1 implements Runnable{
    int i =0;
    @Override
    public void run(){
        while (i < 10){
            System.out.println("Runner1: "+ ++i);
        }
    }
}

class Runner2 implements Runnable{
    int i =0;
    @Override
    public void run(){
        while (i < 10){
            System.out.println("Runner2: "+ ++i);
        }
    }
}

public class ParallerExecution {

    public static void main(String[] args) {
        Runner1 runner1 = new Runner1();
        Runner2 runner2 = new Runner2();

        Thread t1 = new Thread(runner1);
        Thread t2 = new Thread(runner2);

        t1.start();
        t2.start();


        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main method ended");
    }
}

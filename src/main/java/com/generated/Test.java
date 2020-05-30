package com.generated;

public class Test {

    public static void main(String[] args) {
        //Object obj = null;
        add(null);
    }

    public static void add(Thread t){
        System.out.println("Thread");
    }

    public static void add(Object t){
        System.out.println("Object");
    }
}

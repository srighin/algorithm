package com.algorithm.dp;

public class Fibonnaci {

    public static void main(String[] args) {
        System.out.println(findFibonacci(6));
    }

    private static int findFibonacci(int number) {
        if(number <= 1)
            return number;

        return findFibonacci(number-1) + findFibonacci(number -2);
    }
}

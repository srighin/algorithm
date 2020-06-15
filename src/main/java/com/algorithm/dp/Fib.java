package com.algorithm.dp;

import java.util.HashMap;
import java.util.Map;

public class Fib {

    public static Map<Long, Long> cache = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(findFibonacciUsingMemoization(6));
    }

    /**
     *
     * @param number
     * @return
     */
    public static Long findFibonacciUsingMemoization(long number) {
        Long result ;
        if (number == 1 || number == 2) {
            cache.put(number, 1l);
            return 1l;
        }
        if (cache.get(number) == null){
            result = findFibonacciUsingMemoization(number - 1) + findFibonacciUsingMemoization(number - 2);
            cache.put(number, result);
            return result;
        } else {
           return cache.get(number);
        }
    }

}

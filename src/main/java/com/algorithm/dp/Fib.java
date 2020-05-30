package com.algorithm.dp;

import java.util.HashMap;
import java.util.Map;

public class Fib {

    public static Map<Long, Long> cache = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(findFibonacciUsingMomoization(4));
    }

    /**
     *
     * @param number
     * @return
     */
    public static Long findFibonacciUsingMomoization(long number) {
        Long result ;
        if (number == 1 || number == 2) {
            cache.put(number, 1l);
            return 1l;
        }
        if (cache.get(number) == null){
            result = findFibonacciUsingMomoization(number - 1) + findFibonacciUsingMomoization(number - 2);
            cache.put(number, result);
            return result;
        } else {
           return cache.get(number);
        }
    }

}

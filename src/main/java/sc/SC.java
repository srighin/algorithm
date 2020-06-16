package sc;

/**
 * Write a Java Program for Fibonacci series.
 * Fibonacci series is a series of numbers where after the initial two numbers, every occurring number is the sum of two preceding numbers.
 * For Example 0,1,1,2,3,5,8,13,21………
 * input 2
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Write a Java Program to find the duplicate characters in a string
 * Input : abbceddef
 * Output : bd
 */
public class SC {
    public static void main(String[] args) {
        SC sc =  new SC();
        int input = 50;
        String inputStr = "abbceddef";

       String findDuplicate = findDuplicate(inputStr);
       System.out.println("duplicate in String :: "+findDuplicate);
        sc.printFibonacci(input);
    }

    /**
     * find duplicate
     * @param inputStr
     * @return
     */
    private static String findDuplicate(String inputStr) {
        System.out.println("Input:: "+ inputStr);
        StringBuilder result = new StringBuilder();
        Set<Character> seen = new HashSet<>();

        for(char ch: inputStr.toCharArray()){
            if(seen.contains(ch)){
                result.append(ch);
            } else{
                seen.add(ch);
            }
        }
        return result.toString();
    }

    /**
     * print fibonacci
     * @param input
     * For Example 0,1,1,2,3,5,8,13,21………
     * @return
     */
    private void printFibonacci(int input) {

        long [] fib = new long[input];
        fib[0] = 0;
        fib[1] = 1;

        Map<Long, Long> lookup = new HashMap<>();
        lookup.put(0l, 0l);
        lookup.put(1l, 1l);

        for(int i=2; i<input; i++){
            long result =  lookup.get(fib[i-1]) + lookup.get(fib[i-2]);
            fib[i] = result;
            lookup.put(fib[i], result);
        }

        System.out.println("####### Printing fiboncci #########");
        for(int i=0; i<input; i++){
            System.out.println(fib[i]);
        }

    }
}


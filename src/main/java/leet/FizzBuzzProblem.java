package leet;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzProblem {

    public static void main(String[] args) {
        int target = 15;
        List<String> result = returnFizzBuzz(target);
        result.stream().forEach(System.out:: println);
    }

    private static List<String> returnFizzBuzz(int target) {
        List<String> result = new ArrayList<>();

        for (int i=1; i<=target; i++){
            if(i % 3 == 0 && i % 5 == 0){
                result.add("FizzBuzz");
            } else if (i % 3 == 0){
                result.add("Fizz");
            } else if (i % 5 == 0){
                result.add("Buzz");
            } else {
                result.add(String.valueOf(i));
            }
        }

        return result;
    }
}

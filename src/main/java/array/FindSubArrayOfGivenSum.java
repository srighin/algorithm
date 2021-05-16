package array;

import org.springframework.data.mongodb.core.aggregation.ArrayOperators;

import java.util.*;

public class FindSubArrayOfGivenSum {
    public static void main(String[] args) {
        int [] array = {4, 2, 5, 3, 1 ,8};
        int targetSum = 8;
        List<Integer> indexes = findIndexWithGivenSum(array, targetSum);
        indexes.stream().forEach(num -> System.out.print(num+" -> "));

        System.out.println();
        indexes = findIndexWithGivenSum2(array, targetSum);
        indexes.stream().forEach(num -> System.out.print(num+" ..> "));
    }

    private static List<Integer> findIndexWithGivenSum2(int[] array, int targetSum) {
        int startIndex, endIndex;
        int currentSum = 0;
        startIndex = endIndex = 0;
        Map<Integer, Integer> lookup = new HashMap<>();

        while (endIndex < array.length){
            int diff = 0;
            currentSum += array[endIndex];
            if(currentSum == targetSum){
                return Arrays.asList(startIndex, endIndex);
            }
            diff = (currentSum - targetSum);
            if(lookup.containsKey(diff)){
                return Arrays.asList(startIndex+1, endIndex);
            }
            lookup.put(diff, endIndex++);
        }
        return new ArrayList<>();
    }

    private static List<Integer> findIndexWithGivenSum(int[] array, int targetSum) {

        int startIndex, endIndex;
        int currentSum = 0;
        startIndex = endIndex = 0;

        while (endIndex < array.length){
            currentSum += array[endIndex];
            if(currentSum == targetSum){
                return Arrays.asList(startIndex, endIndex);
            }

            while (currentSum > targetSum && startIndex <= endIndex){
                currentSum -= array[startIndex++];
                if(currentSum == targetSum){
                    return Arrays.asList(startIndex, endIndex);
                }
            }
            endIndex++;
        }
        return new ArrayList<>();
    }
}

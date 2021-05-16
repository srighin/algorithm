package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubArraySumWithGivenValue {
    public static void main(String[] args) {
        int [] array = {4, 2, -5, 3, 1, 8};
        int targetSum = 6;

        List<Integer> indexes = findSubArrayWithWithGivenSum(array, targetSum);
        indexes.stream().forEach(index -> System.out.print(index+" -> "));
    }

    private static List<Integer> findSubArrayWithWithGivenSum(int[] array, int targetSum) {
        if(array == null || array.length == 0){
            return new ArrayList<>();
        }

        int startIndex, endIndex, windowSum;
        startIndex = endIndex = 0;
        windowSum = 0;

        while (endIndex < array.length){
            windowSum += array[endIndex];

            if(windowSum == targetSum){
                return Arrays.asList(startIndex, endIndex);
            }

            while (windowSum > targetSum && startIndex <= endIndex){
                windowSum -= array[startIndex++];
                if(windowSum == targetSum){
                    return Arrays.asList(startIndex, endIndex);
                }
            }
            endIndex++;
        }
        return new ArrayList<>();
    }
}

package array;

import java.util.HashMap;
import java.util.Map;

public class FindFirstMissingNumberInArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, -1, -2, -5};
        int missingNumber = findFirstMissingNumber(array);
        System.out.println("Missing Number:: " + missingNumber);
        Map<Integer, Integer> lookup = new HashMap<>();
        lookup.put(12, lookup.getOrDefault(12, 0)+1);
    }

    private static int findFirstMissingNumber(int[] array) {
        if (array.length < 1) {
            return -1;
        }

        int index = 0;
        while (index < array.length) {
            if (array[index] > 0 && array[index] < array.length+1 && array[index] != index + 1) {
                int otherIndex = array[index] - 1;
                int temp = array[otherIndex];
                array[otherIndex] = array[index];
                array[index] = temp;
            } else {
                index++;
            }
        }
        for(int i=0; i< array.length; i++){
            if(array[i] != i+1){
                return i+1;
            }
        }

        return -1;

    }
}

package array;

import java.util.Arrays;
import java.util.List;

public class FindCorruptPair {

    public static void main(String[] args) {
        int[] numbers = {5, 2, 4, 1, 5};
        List<Integer> corruptPair = findCorruptPair(numbers);
        corruptPair.forEach(num -> System.out.println(num));
    }

    private static List<Integer> findCorruptPair(int[] numbers) {
        if (numbers.length == 0) {
            return null;
        }

        int index = 0;
        while (index < numbers.length - 1) {
            if (numbers[index] != numbers[numbers[index] - 1]) {
                int otherIndex = numbers[index] - 1;
                int temp = numbers[otherIndex];
                numbers[otherIndex] = numbers[index];
                numbers[index] = temp;
            } else {
                index++;
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] != i+1){
                return Arrays.asList(i+1, numbers[i]);
            }
        }
        return null;
    }
}

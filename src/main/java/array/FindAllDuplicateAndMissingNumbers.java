package array;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDuplicateAndMissingNumbers {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 3, 5, 5};
        List<List<Integer>> missingAndDuplicate = findMissingAndDuplicate(numbers);
        for (List<Integer> list : missingAndDuplicate) {
            System.out.print(list);
            System.out.println();
        }
    }

    private static List<List<Integer>> findMissingAndDuplicate(int[] numbers) {
        List<List<Integer>> result = new ArrayList<>();
        if (numbers.length == 0) {
            return result;
        }

        int index = 0;

        while (index < numbers.length) {
            if (numbers[index] != index + 1) {
                int otherIndex = numbers[numbers[index] - 1];
                int temp = numbers[otherIndex];
                numbers[otherIndex] = numbers[index];
                numbers[index] = temp;
            }
            index++;
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != i + 1) {
                result.add(Arrays.asList(i + 1, numbers[i]));
            }
        }

        return result;
    }
}

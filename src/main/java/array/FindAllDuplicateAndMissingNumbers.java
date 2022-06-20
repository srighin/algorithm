package array;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDuplicateAndMissingNumbers {

    public static void main(String[] args) {
        int[] numbers = {5, 2, 3, 3, 1, 5};
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
            if (numbers[i] != i + 1) {
                result.add(Arrays.asList(i + 1, numbers[i]));
            }
        }

        return result;
    }
}

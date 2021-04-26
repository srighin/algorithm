package array;


import java.util.ArrayList;
import java.util.List;

public class FindKMissingPositiveNumber {
    public static void main(String[] args) {
        int[] array = {-2, 11, 1, -3, 2, 10, 4};

        List<Integer> list = findKMissingPositiveNUmber(array, 5);
        list.stream().forEach(element -> System.out.print(element + " -> "));
    }

    private static List<Integer> findKMissingPositiveNUmber(int[] array, int kth) {
        List<Integer> missingNumbers = new ArrayList<>();
        if (array == null) {
            return missingNumbers;
        }

        int startIndex = 0;
        while (startIndex < array.length) {
            if (array[startIndex] > 0 && array[startIndex] < array.length && array[startIndex] != array[array[startIndex] - 1]) {
                int otherIndex = array[startIndex] - 1;

                int temp = array[startIndex];
                array[startIndex] = array[otherIndex];
                array[otherIndex] = temp;
            } else {
                startIndex++;
            }
        }


        for (int i = 0; i < array.length; i++) {
            if (array[i] != i + 1 && kth > 0) {
                missingNumbers.add(i + 1);
                kth--;
            }
        }
        return missingNumbers;
    }
}

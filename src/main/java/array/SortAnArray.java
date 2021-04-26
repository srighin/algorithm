package array;

import java.util.Arrays;

public class SortAnArray {
    public static void main(String[] args) {
        int[] number = {0, 1, 2, 0, 1, 2, 0, 1, 1, 1, 2};

        int start = 0, mid = 0;
        int end = number.length - 1;

        while (mid < end) {
            int current = number[mid];

            switch (current) {
                case 0:
                    if (number[start] != number[mid]) {
                        int temp = number[start];
                        number[start] = number[mid];
                        number[mid] = temp;
                    }
                    start++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    if (number[mid] != number[end]) {
                        int temp = number[mid];
                        number[mid] = number[end];
                        number[end] = temp;
                    }
                    end--;
            }

        }

        System.out.println(Arrays.toString(number));
    }
}

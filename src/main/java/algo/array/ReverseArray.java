package algo.array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 4, 5};

        System.out.println("---------- Original Array ----------");
        Arrays.stream(numbers).forEach(System.out:: print);
        System.out.println();

       int startIndex = 0;
       int endIndex = numbers.length -1 ;

       while (startIndex < endIndex){
           swap(numbers, startIndex, endIndex);
           startIndex++;
           endIndex--;
       }
        System.out.println("---------- Reversed Array ----------");
        Arrays.stream(numbers).forEach(System.out:: print);
    }

    private static void swap(int[] numbers, int startIndex, int endIndex) {
        int temp = numbers[startIndex];
        numbers[startIndex] = numbers[endIndex];
        numbers[endIndex] = temp;
    }


}

package array;

import java.util.Arrays;

public class SegregateOddEvenNumbers {
    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 4, 5, 6, 7,8};
        Arrays.stream(numbers).forEach(System.out::print);
        System.out.println();
        int [] segregatedNumber = getSegregatedNumbers(numbers);
        Arrays.stream(segregatedNumber).forEach(System.out::print);
    }

    private static int[] getSegregatedNumbers(int[] numbers) {
        if(numbers.length == 0){
            return new int[0];
        }

        int startIndex = 0;
        int endIndex = numbers.length -1;

        while (startIndex < endIndex){
            while (startIndex < endIndex && numbers[startIndex] % 2 == 0){
                startIndex ++;
            }

            while (startIndex < endIndex && numbers[endIndex] %2 != 0){
                endIndex--;
            }

            if(startIndex < endIndex ){
                int temp = numbers[startIndex];
                numbers[startIndex] = numbers[endIndex];
                numbers[endIndex] = temp;
                startIndex++;
                endIndex--;
            }

        }
        return numbers;
    }
}

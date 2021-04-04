package array;

import java.util.Arrays;

public class SegregateZerosAndOnce {

    public static void main(String[] args) {
        int [] numbers = {0, 0, 1, 1, 1, 0, 1};
        System.out.println(Arrays.toString(numbers));
        segregateZerosAndOnce(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    private static void segregateZerosAndOnce(int[] numbers) {
        if(numbers.length == 0){
            return;
        }

        int startIndex = 0;
        int endIndex = numbers.length-1;

        while(startIndex < endIndex){
            while (startIndex < endIndex && numbers[startIndex] == 0){
                startIndex ++;
            }

            while (startIndex < endIndex && numbers[endIndex] == 1){
                endIndex --;
            }

            if(startIndex < endIndex){
                int temp = numbers[startIndex];
                numbers[startIndex] = numbers[endIndex];
                numbers[endIndex] = temp;
                startIndex++;
                endIndex--;
            }
        }
    }
}

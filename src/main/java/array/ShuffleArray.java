package array;

import java.util.Random;

public class ShuffleArray {
    public static void main(String[] args) {
        int [] array = {3, 7, 4, 1, 8, 9, 10};
        int counter = 0;
        while (counter < 10){
            int [] shuffleArray = shuffleArrayValue(array);
            printArray(shuffleArray);
            System.out.println();
            counter++;
        }
    }

    private static void printArray(int[] shuffleArray) {
        for (int num :
                shuffleArray) {
            System.out.print(num+ " ->");
        }
    }

    private static int[] shuffleArrayValue(int[] array) {
        Random random = new Random();
        for (int index = 0; index < array.length; index++){
            int tempIndex = random.nextInt(array.length);

            int temp = array[index];
            array[index] = array[tempIndex];
            array[tempIndex] = temp;
        }

        return array;
    }
}

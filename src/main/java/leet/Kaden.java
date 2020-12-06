package leet;

public class Kaden {
    public static void main(String[] args) {
        int[] inputArray = {3, 5, -9, 1, 3, -2, 3,4, 7, 2, -9, 6, 3, 1, -5, 4};
        int max = kadanesAlgorithm(inputArray);
        System.out.println(max);
    }
    public static int kadanesAlgorithm(int[] array) {
        int maxSoFar = Integer.MIN_VALUE;
        int maxHere = 0;

        for(int i=0; i< array.length; i++){

            maxHere = Integer.max(array[i], array[i]+maxHere);
            maxSoFar = Integer.max(maxSoFar, maxHere);

        }
        return maxSoFar;
    }
}

package array;

public class LargestSumSubArray {

    public static void main(String[] args) {
        int [] array = {-3, -4, 4, -1, -2, 1, 5, -3};
        int largestSum = getLargestSumSubArray(array);
        System.out.println("largest sum :: "+largestSum);
    }

    private static int getLargestSumSubArray(int[] array) {
        if(array == null || array.length == 0){
            return 0;
        }

        int maxSum = array[0];
        int largestSumSoFar = array[0];

        for (int num: array){
            maxSum = Math.max(maxSum+num, num);
            System.out.print(maxSum+" -- > ");
            largestSumSoFar = Math.max(largestSumSoFar, maxSum);
            System.out.print(largestSumSoFar+" --> ");
            System.out.println();
        }
        return largestSumSoFar;
    }
}

package array;

public class FindMaxSumOfSubArrayWithGivenSize {

    public static void main(String[] args) {
        int [] array = {3,2, 5, 4,1};
        int maxSum = findMaxSum(array, 2);
        System.out.println(maxSum);
    }

    private static int findMaxSum(int[] array, int kth) {
        int sum = 0;

        for (int i=0; i< kth; i++){
            sum+=array[i];
        }

        int maxSum = sum;
        int startIndex = 0;
        for(int j=kth; j < array.length; j++){
            sum = sum + array[j] - array[startIndex++];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}

package array;

public class FindSubArrayWithMaxSum {
    public static void main(String[] args) {
        int [] array = {-3, 2, -7, 6, -2, 4, -8, 5};
        int maxSum = findSumUsingKadane(array);
        System.out.println(maxSum);
    }

    private static int findSumUsingKadane(int[] array) {
        if(array == null || array.length == 0){
            return -1;
        }

        int sum, maxSum;
        sum= maxSum = 0;
        boolean isPositive = false;
        int maxNegative = Integer.MIN_VALUE;

        for(int num: array){

            if(num >= 0)
                isPositive = true;

            maxNegative = Math.max(num, maxNegative);

            sum+=num;
            if(sum < 0){
                sum = 0;
            }
            maxSum = Math.max(maxSum, sum);

        }
        return isPositive ? maxSum: maxNegative;
    }
}

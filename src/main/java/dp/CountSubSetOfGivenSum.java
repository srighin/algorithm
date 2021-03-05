package dp;

public class CountSubSetOfGivenSum {

    public static int[][] lookup;

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 5, 8, 10};
        int sum = 10;

        int countSetOfGivenSum = countSetOfGivenSum(numbers, sum);
        System.out.println(countSetOfGivenSum);
    }


    public static int countSetOfGivenSum(int[] numbers, int sum) {

        lookup = new int[sum + 1][numbers.length + 1];
        int countSetOfSum = dp(numbers, sum, numbers.length);
        System.out.println("Is sub set sum exist:: " + countSetOfSum);
        return countSetOfSum;
    }

    public static int dp(int[] numbers, int sum, int n) {
        if(n == 0){
            return 0;
        }
        if(sum == 0){
            return 1;
        }

        if(numbers[n-1] > sum){
            return dp(numbers, sum, n-1);
        }else {
            return dp(numbers, sum - numbers[n-1], n-1) +
                    dp(numbers, sum, n-1);
        }
    }
}

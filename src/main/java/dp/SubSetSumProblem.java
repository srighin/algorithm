package dp;

public class SubSetSumProblem {

    public static boolean [][] lookup;

    public static boolean main(int [] numbers, int sum) {
        //int [] numbers = {1, 2, 4};
        //int sum = 9;

        lookup = new boolean[sum+1][numbers.length+1];

        for(int i=0; i<=sum; i++){
            for (int j=0; j<=numbers.length; j++){
                if(i==0){
                    lookup[i][j] = true;
                }
                if(j==0){
                    lookup[i][j] = false;
                }
            }
        }
        boolean isSubSetSumExist = dp(numbers, sum, numbers.length);

        System.out.println("Is sub set sum exist:: "+isSubSetSumExist);
        return isSubSetSumExist;
    }

    public static boolean dp(int[] numbers, int sum, int n) {
        if(sum == 0){
            return true;
        }
        if(n == 0){
            return false;
        }

        lookup[sum][n] = dp(numbers, sum - numbers[n-1], n-1) ||
                dp(numbers, sum, n-1);
        return lookup[sum][n];
    }
}

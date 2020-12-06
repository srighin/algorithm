package leet;

public class MaxProfitProblem {

    public static void main(String[] args) {
        int [] data = {7, 6, 1, 2, 3, 7};
        int maxProfit = findMaxProfit(data);
        System.out.println(maxProfit);
    }

    private static int findMaxProfit(int[] data) {
        int max = 0;
        int min = Integer.MAX_VALUE     ;

        for (int i : data){
            if(i < min) {
                min = i;
            }else {
                max = Math.max(max, (i - min));
            }
        }
        return max;
    }
}

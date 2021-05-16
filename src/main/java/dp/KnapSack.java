package dp;

public class KnapSack {
    public static void main(String[] args) {
        int[] weights = {1, 2, 3, 4, 5};
        int[] values = {1, 3, 6, 7, 9};
        int kw = 7;
        int maxProfit = getMaxProfit(weights, values, kw, weights.length);
        System.out.println("Recursive :: "+ maxProfit);

        Integer [][] lookup = new Integer[kw+1][weights.length+1];
        maxProfit = getMaxProfitMomozies(weights, values, kw, weights.length, lookup);
        System.out.println("Memozise :: "+maxProfit);

        maxProfit = getMaxProfitTopDown(weights, values, kw, weights.length);
        System.out.println("Topdown :: "+ maxProfit);
    }

    private static int getMaxProfitTopDown(int[] weights, int[] values, int kw, int n) {
        if(kw == 0 || n ==0){
            return 0;
        }

        int [][] lookup =  new int[n+1][kw+1];

        for(int i=1; i< n+1; i++){
            for (int j=1; j< kw+1; j++){
                if(weights[i-1] <= j){
                    lookup[i][j] = Math.max(values[i-1]+ lookup[i-1][j-weights[i-1]],
                            lookup[i-1][j]);
                }else {
                    lookup[i][j] =lookup[i-1][j];
                }
            }
        }
        return lookup[n][kw];
    }

    private static int getMaxProfit(int[] weights, int[] values, int kw, int n) {
        if(n==0 || kw == 0){
            return 0;
        }

        if(weights[n-1] > kw){
            return getMaxProfit(weights, values, kw, n-1);
        }else {
            return Math.max(values[n-1]+getMaxProfit(weights, values, kw-weights[n-1], n-1),
                    getMaxProfit(weights, values, kw, n-1));
        }
    }

    private static int getMaxProfitMomozies(int[] weights, int[] values, int kw, int n, Integer[][] lookup) {
        if(n==0 || kw == 0){
            return 0;
        }

        if(lookup[kw][n] == null){
            if(weights[n-1] > kw){
                lookup[kw][n] =  getMaxProfitMomozies(weights, values, kw, n-1, lookup);
            }else {
                lookup[kw][n] =  Math.max(values[n-1]+getMaxProfitMomozies(weights, values, kw-weights[n-1], n-1, lookup),
                        getMaxProfitMomozies(weights, values, kw, n-1, lookup));
            }
            return lookup[kw][n];
        }else {
            return lookup[kw][n];
        }
    }
}

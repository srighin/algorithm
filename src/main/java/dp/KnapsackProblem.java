package dp;

import java.util.stream.IntStream;

import static java.lang.Integer.max;

public class KnapsackProblem {

    private static int [][] lookup;

    public static void main(String[] args) {

        int[] weights = {1, 2, 3, 4, 5};
        int[] values = {1, 3, 4, 7, 9};
        int kw = 7;

        lookup = new int[values.length+1][kw+1];
        IntStream.range(0, kw+1).forEach(i -> IntStream.range(0, values.length+1).forEach(j -> lookup[i][j] = -1));
        int maxValue = calculateMaxValue(weights, values, kw, weights.length);
        //int maxValue = topDown(weights, values, kw, weights.length);
        System.out.println("max value: " + maxValue);
    }

    static int knapSack( int wt[],
                        int val[],int W, int n)
    {
        int i, j;
        int K[][] = new int[n + 1][W + 1];

        // Build table K[][] in bottom up manner
        for (i = 0; i <= n; i++)
        {
            for (j = 0; j <= W; j++)
            {
                if (i == 0 || j == 0)
                    K[i][j] = 0;
                else if (wt[i - 1] <= j)
                    K[i][j]
                            = max(val[i - 1] + K[i - 1][j - wt[i - 1]],
                            K[i - 1][j]);
                else
                    K[i][j] = K[i - 1][j];
            }
        }

        return K[n][W];
    }



    private static int calculateMaxValue(int[] wt, int[] values, int w, int n) {
        if (w == 0 || n == 0) {
            return 0;
        }

        if(lookup[w-1][n-1] != -1){
            return lookup[w-1][n-1];
        }

        if(wt[n - 1] > w) {
            lookup[w-1][n-1] = calculateMaxValue(wt, values, w, n - 1);
        } else {
            lookup[w-1][n-1] = Math.max(values[n - 1] + calculateMaxValue(wt, values, w - wt[n - 1], n - 1),
                    calculateMaxValue(wt, values, w, n - 1));
        }
        return lookup[w-1][n-1];
    }
}

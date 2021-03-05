package dp;

public class KnapsackTopDown {


    public static void main(String[] args) {
        int[] weights = {1, 2, 3, 4, 5};
        int[] values = {1, 3, 6, 7, 9};
        int kw = 7;
        //int maxValue = calculateMaxValue(weights, values, kw, weights.length);
        int maxValue = knapSack(kw, weights, values, weights.length);
        System.out.println("max value: " + maxValue);
    }

    static int knapSack(int W, int wt[], int val[], int n) {

        int lookup[][] = new int[n + 1][W + 1];
        for (int w = 0; w <= W; w++) {
            for (int i = 0; i <= n; i++) {
                if (i == 0 || w == 0)
                    lookup[i][w] = 0;
                else if (wt[i - 1] <= w)
                    lookup[i][w] = Math.max(val[i - 1] + lookup[i - 1][w - wt[i - 1]],
                            lookup[i - 1][w]);
                else
                    lookup[i][w] = lookup[i - 1][w];
            }
        }

        return lookup[n][W];
    }

    private static int calculateMaxValue(int[] weights, int[] values, int weight, int noOfElement) {
        int[][] lookup = new int[weight + 1][noOfElement + 1];

        for (int n = 0; n <= noOfElement; n++) {
            for (int w = 0; w <= weight; w++) {
                if (w == 0 || n == 0) {
                    lookup[w][n] = 0;
                } else if (weights[n - 1] > weight) {
                    lookup[w][n] = lookup[w][n - 1];
                } else {
                    lookup[w][n] = Math.max((values[n - 1] + (lookup[weight - weights[n - 1]][n - 1])),
                            lookup[w][n - 1]);
                }
            }
        }
        return lookup[weight][noOfElement];

    }
}

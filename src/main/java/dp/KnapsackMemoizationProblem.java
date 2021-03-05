package dp;

import java.util.stream.IntStream;

public class KnapsackMemoizationProblem {

    public static int[][] lookup;

    public static void main(String[] args) {
        int[] weights = {1, 2, 3, 4, 5};
        int[] values = {1, 3, 4, 7, 9};


        int kw = 7;
        lookup = new int[7+1][weights.length+1];

        for(int i=0; i< kw+1; i++){
            for(int j=0; j < weights.length+1; j++){
                lookup[i][j] = -1;
            }
        }
       // IntStream.range(0, weights.length+1).forEach(i -> IntStream.range(0, values.length+1).forEach(j -> lookup[i][j] = -1));

        int maxValue = calculateMaxValue(weights, values, kw, weights.length);
        System.out.println("max value: "+maxValue);
    }

    private static int calculateMaxValue(int[] weights, int[] values, int w, int n) {
        if(w==0 || n==0){
            return 0;
        }

        if(lookup[w-1][n-1] != -1){
            return lookup[w-1][n-1];
        }

        if(weights[n-1] > w){
            lookup[w-1][n-1] = calculateMaxValue(weights, values, w, n-1);
            return lookup[w-1][n-1];
        }else {
            lookup[w-1][n-1] = Math.max(values[n-1]+ calculateMaxValue(weights, values, w - weights[n-1], n-1),
                    calculateMaxValue(weights, values, w, n-1));
            return lookup[w-1][n-1];
        }
    }
}

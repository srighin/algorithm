package dp;

import java.util.Arrays;

public class LongestIncreasingSubsequence {

    public static void main(String[] args) {
        int[] array = {10, 22, 9, 33, 21, 50, 41, 60};

        int[] lis = new int[array.length];
        Arrays.fill(lis, 1);

        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if(array[i] > array[j]){
                    lis[i] = lis[j]+1;
                }
            }
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i< lis.length; i++){
            if(lis[i] > max){
                max = lis[i];
            }
        }
        System.out.println(max);
    }
}

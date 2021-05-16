package array;
import java.util.*;
public class FindMaxMultiplicationOfAnyTwoNumber {
    public static void main(String[] args) {
        int [] array = {4, 1, 3, 6, 7, 8};
        int maxProduct = findMaxProduct(array);
        System.out.println(maxProduct);

        maxProduct = findMaxProductBetter(array);
        System.out.println("Better approach :: "+maxProduct);
    }

    // O(n)
    private static int findMaxProductBetter(int[] array) {
        if(array== null || array.length < 2){
            return -1;
        }
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int num: array){
            if(num > max){
                secondMax = max;
                max = num;
            }else if(num > secondMax){
                secondMax = num;
            }
        }

        return max*secondMax;

    }

    // nlogn complexity
    private static int findMaxProduct(int[] array) {
        Arrays.sort(array);
        return array[array.length-1]*array[array.length-2];
    }
}

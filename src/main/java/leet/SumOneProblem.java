package leet;

import java.util.stream.IntStream;

public class SumOneProblem {
    public static void main(String[] args) {
        int [] num = {9, 9, 9};
        int [] result = addOne(num);
        IntStream.of(result).forEach(System.out::print);
    }

    private static int[] addOne(int[] num) {

        for(int i=num.length -1; i> 0 ; i--){
            if(num[i]<9){
                num[i]++;
                return num;
            }else {
                num[i] = 0;
            }
        }

        int[] result = new int[num.length + 1];
        result[0] = 1;
        return result;
    }
}

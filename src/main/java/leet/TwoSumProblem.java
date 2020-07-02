package leet;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class TwoSumProblem {

    public static void main(String[] args) {
        int [] integer = {2, 7, 9, 11};
        int target = 13;
        int [] result = twoSumProblem(integer, target);
        IntStream.of(result).forEach(System.out::print);
    }

    private static int[] twoSumProblem(int[] integer, int target) {
        Map<Integer, Integer> lookup = new HashMap<>();
        int [] result = new int[2];
        for (int i=0; i< integer.length; i++){
            int diff = target - integer[i];
            if(lookup.containsKey(diff)){
                result[0] = i;
                result[1] = lookup.get(diff);
                return result;
            } else {
                lookup.put(integer[i], i);
            }
        }
        return result;
    }
}

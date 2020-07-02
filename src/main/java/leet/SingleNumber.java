package leet;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber {

    public static void main(String[] args) {
        int [] numbers = {1, 2, 2, 3, 3};
        int result = findSingleNumber(numbers);
        System.out.println(result);
    }

    private static int findSingleNumber(int[] numbers) {
        Set<Integer> lookup = new HashSet<>();
        for(int num: numbers){
            if(lookup.contains(num)){
                lookup.remove(num);
            }else {
                lookup.add(num);
            }
        }

        for(int num: lookup){
            return num;
        }
        return -1;
    }
}

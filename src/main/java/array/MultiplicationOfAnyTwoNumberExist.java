package array;

import java.util.HashSet;
import java.util.Set;

public class MultiplicationOfAnyTwoNumberExist {
    public static void main(String[] args) {
        int [] array = {4, 1, 3, 6, 7, 8};
        int target = 12;
        boolean isProductExist = checkProductExistForAnyPair(array, target);
        System.out.println(isProductExist);
    }

    private static boolean checkProductExistForAnyPair(int[] array, int target) {
        if(array == null || array.length == 0 || target == 0){
            return false;
        }

        Set<Integer> lookup = new HashSet<>();

        for(int num : array){
            if(target % num == 0 && lookup.contains(target/num)){
                return true;
            }else {
                lookup.add(num);
            }
        }
        return false;
    }
}

package leet;

import java.util.HashSet;
import java.util.Set;

public class CheckDuplicate {

    public static void main(String[] args) {
        int [] numbers = {1, 2, 4, 5};
        boolean containsDuplicate = checkDuplicate(numbers);
        System.out.println(containsDuplicate);
    }

    private static boolean checkDuplicate(int[] numbers) {
        Set<Integer> hashTable = new HashSet<>();
        for(int i=0; i< numbers.length; i++){
            if(hashTable.contains(numbers[i])){
                return true;
            }else {
                hashTable.add(numbers[i]);
            }
        }
        return false;
    }
}

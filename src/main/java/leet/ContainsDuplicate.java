package leet;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static void main(String[] args) {
        int [] number = {1, 2, 4,  3};

        Set<Integer> hashTable = new HashSet<>();

        boolean isDuplicateFound = false;

        for (int i=0; i< number.length; i++){
            if(hashTable.contains(number[i])){
                isDuplicateFound = true;
                break;
            }
            hashTable.add(number[i]);
        }

        System.out.println(isDuplicateFound);
    }
}

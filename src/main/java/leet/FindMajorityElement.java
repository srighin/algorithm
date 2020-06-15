package leet;

import java.util.HashMap;
import java.util.Map;

public class FindMajorityElement {

    public static void main(String[] args) {
        int [] numbers = {1,2,2, 1, 1};
        int majority = findMajorityElement(numbers);
        System.out.println(majority);
    }

    private static int findMajorityElement(int[] numbers) {

        Map<Integer, Integer> hashTable = new HashMap<>();

        for(int num: numbers){
            if(hashTable.containsKey(num) && hashTable.get(num)+1 > numbers.length/2){
                return num;
            }else {
                hashTable.put(num, hashTable.getOrDefault(num, 0)+1);
            }
        }
        return -1;
    }
}

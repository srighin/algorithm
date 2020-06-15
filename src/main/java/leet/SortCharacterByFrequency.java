package leet;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortCharacterByFrequency {

    public static void main(String[] args) {
        String str = "treeeeaa";
        SortCharacterByFrequency sortCharacterByFrequency = new SortCharacterByFrequency();
        String result = sortCharacterByFrequency.frequencySort(str);
        System.out.println(result);
    }

    private String frequencySort(String str) {
        StringBuilder result = new StringBuilder();
        Map<Character, Integer> hashTable = new HashMap<>();
        for (char ch : str.toCharArray()){
            hashTable.put(ch, hashTable.getOrDefault(ch, 0)+1);
        }
        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b) -> hashTable.get(b) - hashTable.get(a));
        maxHeap.addAll(hashTable.keySet());

        while(!maxHeap.isEmpty()){
            Character currentChar = maxHeap.remove();
            for(int i=0; i< hashTable.get(currentChar); i++){
                result.append(currentChar);
            }
        }
        return result.toString();
    }
}

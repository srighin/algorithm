package leet;

import java.util.HashMap;
import java.util.Map;

public class FindFirstUniqueCharacter {

    public static void main(String[] args) {
        String s1 = "leetcode";
        int index = findFirstUniqueCharacterIndex(s1);
        System.out.println(index);
    }

    private static int findFirstUniqueCharacterIndex(String s1) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i =0; i < s1.length(); i++){
            if(!map.containsKey(s1.charAt(i))){
                map.put(s1.charAt(i), i);
            } else {
                map.put(s1.charAt(i), -1);
            }
        }
        int min = Integer.MAX_VALUE;

        for(char key: map.keySet()){
            if(map.get(key) > -1 && map.get(key) < min){
                min = map.get(key);
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}

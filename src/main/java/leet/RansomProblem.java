package leet;

import java.util.HashMap;
import java.util.Map;

public class RansomProblem {
    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aab";

        boolean result = canConstruct(ransomNote, magazine);
        System.out.println(result);
    }

    private static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> lookup = new HashMap<>();

        for (char ch: magazine.toCharArray()){
            lookup.put(ch, lookup.getOrDefault(ch, 0)+1);
        }

        for(char ch: ransomNote.toCharArray()){
            if(!lookup.containsKey(ch) || lookup.get(ch) <=0){
                return false;
            } else {
                lookup.put(ch, lookup.get(ch)-1);
            }
        }

        return true;
    }
}

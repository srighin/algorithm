package leet;

import java.util.HashMap;
import java.util.Map;

public class FindFirstUniqueOccuerence {

    public static void main(String[] args) {
        String str = "loveleetcode";
        System.out.println(findFirstUniqueOccurrence(str));
    }

    public static int findFirstUniqueOccurrence(String str){

        Map<Character, Integer> lookup = new HashMap<>();

        for(int i=0; i < str.length(); i++){
            if(!lookup.containsKey(str.charAt(i))){
                lookup.put(str.charAt(i), i);
            } else {
                lookup.put(str.charAt(i), -1);
            }
        }

        int min = Integer.MAX_VALUE;
        for(char ch: lookup.keySet()){
            if(lookup.get(ch) > -1 && lookup.get(ch) < min){
                min = lookup.get(ch);
            }
        }
        return min;
    }
}

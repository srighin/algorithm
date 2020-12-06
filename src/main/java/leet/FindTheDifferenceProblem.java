package leet;

import java.util.HashMap;
import java.util.Map;

public class FindTheDifferenceProblem {
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "abcde";

        Map<Character, Integer> lookup = new HashMap<>();
        for (int i=0; i< str1.length(); i++){
            lookup.put(str1.charAt(i), lookup.getOrDefault(str1.charAt(i), 0)+1);
        }

        for(Character ch : str2.toCharArray()){
            if(!lookup.containsKey(ch)){
                System.out.println(ch);
            }
        }
    }
}

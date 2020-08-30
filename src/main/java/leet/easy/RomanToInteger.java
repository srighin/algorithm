package leet.easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        String roman = "III";
        System.out.println(convertToInteger(roman));
    }

    private static int convertToInteger(String s) {
        if(s== null || s.length()==0){
            return 0;
        }
        Map<String, Integer> lookup = new HashMap<>();
        lookup.put("I", 1);
        lookup.put("V", 5);
        lookup.put("X", 10);
        lookup.put("L", 50);
        lookup.put("C", 100);
        lookup.put("D", 500);
        lookup.put("M", 1000);

        if(s.length() == 1){
            return lookup.get(String.valueOf(s.charAt(0)));
        }
        int counter = 0;
        int sum = 0;

        while (counter+1 < s.length()) {
            if(lookup.get(String.valueOf(s.charAt(counter))) >= lookup.get(String.valueOf(s.charAt(counter+1)))){
                sum += lookup.get(String.valueOf(s.charAt(counter++)));
            } else {
                sum += lookup.get(String.valueOf(s.charAt(counter+1))) - lookup.get(String.valueOf(s.charAt(counter++)));
                counter++;
            }
        }
        if(counter < s.length()){
            sum += lookup.get(s.charAt(counter)+"");
        }
        return  sum;

    }
}

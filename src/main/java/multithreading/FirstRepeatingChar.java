package multithreading;

import java.util.*;

public class FirstRepeatingChar {

    public static void main(String[] args) {

        String str = "aabccdd";
        char[] chars = str.toCharArray();
        Set<Character> lookup =  new HashSet<>();

        for (char ch : chars) {
            if(lookup.contains(ch)){
                System.out.println(ch);
                break;
            }
            lookup.add(ch);
        }
    }
}

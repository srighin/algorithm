package leet;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveVowelFromString {

    public static void main(String[] args) {
        String str = "aeiou";
        System.out.println(removeVowels(str));
    }

    private static String removeVowels(String str) {
        Set<Character> vowels = Stream.of('a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U').collect(Collectors.toSet());
        char [] chars = str.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for(char ch: chars){
            if(!vowels.contains(ch)){
                stringBuilder.append(ch);
            }
        }
        return stringBuilder.toString();
    }
}

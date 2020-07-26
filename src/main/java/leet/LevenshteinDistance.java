package leet;

import java.util.Arrays;

public class LevenshteinDistance {
    public static void main(String[] args) {
        String str1 = "";
        String str2 = "yabd";
        System.out.println(levenshteinDistance(str1, str2));
    }

    public static int levenshteinDistance(String str1, String str2) {
        char[] chars2 = str2.toCharArray();
        char[] chars1 = str1.toCharArray();

        Arrays.sort(chars2); //abdy
        Arrays.sort(chars1); // abc
        int counter = 0;
        int index = 0;
        for(int i=0; i< chars2.length; i++){
            if (index < chars1.length && chars2[i] != chars1[index]){
                counter++;
            } else{
                index++;
            }
        }
        return counter;
    }
}

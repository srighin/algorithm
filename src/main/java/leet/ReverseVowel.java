package leet;

import java.util.HashSet;
import java.util.Set;

public class ReverseVowel {

    public static void main(String[] args) {
        String str = "hello";
        String revereVowel = reverseVowel(str);
        System.out.println(revereVowel);
    }

    private static String reverseVowel(String str) {

        int iStart = 0;
        int iEnd = str.length() - 1;
        char [] strArray = str.toCharArray();
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('A');
        vowels.add('e');
        vowels.add('E');
        vowels.add('i');
        vowels.add('I');
        vowels.add('o');
        vowels.add('O');
        vowels.add('u');
        vowels.add('U');

        while (iStart < iEnd){
            while(iStart< iEnd && !vowels.contains(strArray[iStart])){
                iStart++;
            }

            while(iStart < iEnd && !vowels.contains(strArray[iEnd])){
                iEnd--;
            }

            char temp = strArray[iStart];
            strArray[iStart++] = strArray[iEnd];
            strArray[iEnd--] = temp;

        }
        return new String(strArray);
    }
}

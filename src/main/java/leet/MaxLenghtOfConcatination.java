package leet;

import java.util.HashSet;
import java.util.Set;

public class MaxLenghtOfConcatination {

    public static void main(String[] args) {
        String [] strArrays = {"un", "iq", "ue"};
        int maxLenght = maxLenthOfStrings(strArrays);
        System.out.println(maxLenght);
    }

    private static int maxLenthOfStrings(String[] strArrays) {

        int maxLenght = 0;
        Set<Character> characters= new HashSet<>();
        for (int i=0; i< strArrays.length; i++){
            for (int j=i+1; j< strArrays.length ; j++){

            }
        }

        return maxLenght;
    }
}

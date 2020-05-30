package algo.array;

import java.util.Arrays;

/**
 * Two string are anagram if the same letters in the string are rearrange
 */
public class CheckAnagram {

    public static void main(String[] args) {
        String [] arr1 = {"g", "o", "o", "g", "l", "e"};
        String [] arr2 = {"o","g",  "o", "g", "l"};
        Arrays.asList(arr1).stream()
                .forEach(System.out:: print);
        System.out.println();
        Arrays.asList(arr2).stream().forEach(System.out:: print);
        boolean isAnagram = checkAnagram(arr1, arr2);
        System.out.println();
        System.out.println("Is Anagram:: "+isAnagram);
    }

    private static boolean checkAnagram(String[] arr1, String[] arr2) {

        if (arr1.length != arr2.length)
            return false;
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int index = 0; index <arr1.length; index ++){
            if(!arr1[index].equalsIgnoreCase(arr2[index])){
                return false;
            }
        }
        return true;
    }
}

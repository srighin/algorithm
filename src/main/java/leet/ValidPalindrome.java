package leet;

public class ValidPalindrome {

    public static void main(String[] args) {
        String s = "aba";

        boolean isValidPalindrome = isValidPalindrom(s);
        System.out.println(isValidPalindrome);
    }

    private static boolean isValidPalindrom(String str) {
        int startIndex = 0;
        int endIndex = str.length()-1;

        while(startIndex < endIndex){
            if(str.charAt(startIndex) != str.charAt(endIndex)){
                //trick lies here
                return isPalindrome(str, startIndex+1, endIndex) || isPalindrome(str, startIndex, endIndex-1);
            }
            startIndex++;
            endIndex--;
        }
        return true;
    }

    private static boolean isPalindrome(String str, int startIndex, int endIndex) {
        while(startIndex < endIndex){
            if(str.charAt(startIndex) != str.charAt(endIndex)){
                return false;
            }
            startIndex++;
            endIndex --;
        }
        return true;
    }
}

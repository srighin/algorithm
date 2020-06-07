package leet;

public class CheckPalindrome {
    public static void main(String[] args) {
        String str = "race e car";

        boolean isPalindrome = isPalindrome(str);
        System.out.println(isPalindrome);
    }

    private static boolean isPalindrome(String str) {

        int startIndex = 0;
        int endIndex = str.length()-1;

        while (startIndex < endIndex){

            while(startIndex < endIndex && !Character.isLetterOrDigit(str.charAt(startIndex))){
                startIndex++;
            }

            while(startIndex < endIndex && !Character.isLetterOrDigit(str.charAt(endIndex))){
                endIndex--;
            }
             if(startIndex < endIndex && Character.toLowerCase(str.charAt(startIndex++)) != Character.toLowerCase(str.charAt(endIndex--))){
                 return false;
             }
        }
        return true;
    }
}

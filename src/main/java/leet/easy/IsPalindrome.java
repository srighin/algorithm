package leet.easy;

public class IsPalindrome {

    public static void main(String[] args) {
        int number = 10;
        System.out.println(isPalindrome(number));
    }

    private static boolean isPalindrome(int x) {
        char[] chars = Integer.valueOf(x).toString().toCharArray();
        int startIndex = 0;
        int endIndex = chars.length-1;

        while(startIndex< endIndex){
            if(chars[startIndex++]!=chars[endIndex--])
            {
                return false;
            }
        }
        return true;
    }
}

package basic;

public class ANumberIsPalindrome {
    public static void main(String[] args) {
        int number = 123321;

        int sum = 0;
        int temp = number;

        while (temp > 0){
            sum= sum*10 + temp % 10;
            temp=temp/10;
        }

        System.out.println("Is number palindrome ::"+ (number == sum));
    }
}

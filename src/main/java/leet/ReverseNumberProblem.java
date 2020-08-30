package leet;

public class ReverseNumberProblem {

    public static void main(String[] args) {
        int number = 1534236469;
        System.out.println(reverseNumber(number));
    }

    private static int reverseNumber(int x) {
        long result=0;
        int sign = 1;
        if (x < 0){
            sign = -1;
        }
        x = Math.abs(x);

        while(x > 0){
            int mod = x % 10;
            result = result*10 + mod;
            x = x/10;
        }
        result =  result * sign;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE){
            return  0;
        } else {
            return (int)result;
        }
    }
}

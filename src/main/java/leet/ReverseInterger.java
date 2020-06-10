package leet;

public class ReverseInterger {

    public static void main(String[] args) {
        int number = 889991001;
        boolean isNegative = false;

        if(number < 0){
            isNegative = true;
            number *= -1;
        }

        long reverseNum = 0;

        while(number > 0){
            reverseNum = (reverseNum *  10) + number % 10;
            number /=10;
        }

        if (reverseNum > Integer.MAX_VALUE){
            reverseNum = 0;
        }
        reverseNum = isNegative ? -1*reverseNum : reverseNum;

        System.out.println(reverseNum);
    }
}

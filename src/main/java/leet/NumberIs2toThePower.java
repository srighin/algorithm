package leet;

public class NumberIs2toThePower {

    public static void main(String[] args) {

        int number = 16;
        int actualNumber = 1;
        while(actualNumber < number){
            actualNumber *=2;
        }

        System.out.println(actualNumber == number);
    }
}

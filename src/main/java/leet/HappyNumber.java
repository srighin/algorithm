package leet;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args) {
        int number = 19;
        boolean isHappyNumber = isHappyNumber(number);
        System.out.println("Is Happy Number:: "+isHappyNumber);
    }

    private static boolean isHappyNumber(int number) {
        Set<Integer> seen = new HashSet<>();

        while(number != 1){
            int current = number;
            int sum = 0;

            while(current != 0){
                sum+= (current % 10) * (current % 10);
                current /= 10;
            }
            System.out.println("number:: "+sum);
            if(seen.contains(sum)){
                return false;
            }
            seen.add(sum);
            number = sum;
        }
        return true;
    }
}

package basic;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    public static void main(String[] args) {
        int happyNumber = 409;
        boolean isHappyNumber = isHappyNumber(happyNumber);
        System.out.println("Is happy number:: " + isHappyNumber);
    }

    private static boolean isHappyNumber(int happyNumber) {
        Set<Integer> lookup = new HashSet<>();

        int temp = happyNumber;
        int sum = 0;
        while (true) {
            sum = 0;
            while (temp > 0) {
                int remainder = temp % 10;
                sum += remainder * remainder;
                temp = temp / 10;
            }
            temp = sum;
            if (sum == 1) {
                return true;
            }
            if (lookup.contains(sum)) {
                return false;
            } else {
                lookup.add(sum);
            }
        }

    }
}

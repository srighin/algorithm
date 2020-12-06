package leet;

import java.util.Arrays;

public class BoatToSavePeople {

    public static void main(String[] args) {
        int [] people = {1, 2, 3};
        int noOfBoats = noOfBoats(people, 3);
        System.out.println(noOfBoats);
    }

    private static int noOfBoats(int[] people, int target) {
        Arrays.sort(people);
        int noOfBoats = 0;

        int start = 0;
        int end = people.length -1;

        while (start <= end){
            if(people[start] + people[end] <= target){
                start ++;
                end --;
            } else {
                end --;
            }
            noOfBoats ++;
        }

        return noOfBoats;
    }
}

package array;

import java.util.HashSet;
import java.util.Set;

public class FindFirstElementOccurrence {

    public static void main(String[] args) {
        int [] numbers = {2, 3, 5, 7, 3, 2};
        Set<Integer> lookup = new HashSet<>();
        int firstOccurrence = -1;

        for (int i=numbers.length-1; i>= 0; i--){
            if(!lookup.contains(numbers[i])){
                lookup.add(numbers[i]);
            }else {
                firstOccurrence = numbers[i];
            }
        }

        System.out.println(firstOccurrence);
    }
}

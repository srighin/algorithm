package array;

import java.util.HashSet;
import java.util.Set;

public class FindFirstRepeatingElement {
    public static void main(String[] args) {
        int [] array = {2, 3, 4, 4, 3, 5, 7};
        int firstRepeating = findFirstRepeatingElement(array);
        System.out.println(firstRepeating);
    }

    private static int findFirstRepeatingElement(int[] array) {
        if(array == null || array.length == 0){
            return -1;
        }

        Set<Integer> lookup = new HashSet<>();
        for(int num: array){
            lookup.add(num);
        }
        int index = array.length-1;
        int firstOccurrence = array[index];
        while (--index >= 0){
            if(lookup.contains(array[index])){
                firstOccurrence = array[index];
            }
        }
        return firstOccurrence;
    }
}

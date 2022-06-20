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
       int firstRepeating = -1;

       for(int index = array.length-1; index >= 0; index--){
           if(lookup.contains(array[index])){
               firstRepeating = array[index];
           }else {
               lookup.add(array[index]);
           }
       }

       return firstRepeating;
    }
}

package array;

import java.util.Arrays;

public class SortArrayWithNumFrom1ToN {
    public static void main(String[] args) {
        int [] array = {1, 3, 5, 4, 2};
        int startIndex = 0;

        while(startIndex < array.length){
            if(array[startIndex] - 1 != startIndex){
                int otherIndex = array[startIndex] -1;

                int temp = array[startIndex];
                array[startIndex] = array[otherIndex];
                array[otherIndex] = temp;
            } else {
                startIndex++;
            }
        }

        Arrays.stream(array).forEach(element -> System.out.print(element+" -> "));
    }
}

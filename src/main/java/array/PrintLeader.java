package array;

import java.util.ArrayList;
import java.util.List;

public class PrintLeader {
    public static void main(String[] args) {
        int [] array = {14, 15, 8, 9, 5, 2};
        findLeaders(array).stream().forEach(num -> System.out.print(num+" -> "));
    }

    private static List<Integer> findLeaders(int[] array) {
        int endIndex = array.length-1;
        List<Integer> leaders = new ArrayList<>();
        leaders.add(array[endIndex]);

        while (--endIndex >= 0){
            if(array[endIndex] > array[endIndex+1]){
                leaders.add(array[endIndex]);
            }
        }

        return leaders;
    }
}

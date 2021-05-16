package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMissingAndDuplicateNumber {
    public static void main(String[] args) {
        int [] array = {4, 3, 4, 1, 2};
        List<Integer> result = findTheMissingAndDuplicateNumber(array);
        System.out.println("Missing number: "+result.get(0)+" Duplicate number:: "+result.get(1));
    }

    private static List<Integer> findTheMissingAndDuplicateNumber(int[] array) {
        if(array ==  null || array.length == 0){
            return new ArrayList<>();
        }

        for(int index = 0; index < array.length; index++){
            if(array[index] != array[array[index]-1]){
                int otherIndex = array[index]-1;
                int temp = array[index];
                array[index] = array[otherIndex];
                array[otherIndex] = temp;
            }else {
                index++;
            }
        }

        for(int index = 0; index < array.length; index++){
            if(index+1 != array[index]){
                return Arrays.asList(index+1, array[index]);
            }
        }
        return null;
    }
}

package array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindFirstKMissingPositiveNumber {
    public static void main(String[] args) {
        int [] array = {-2, 11, 1, -3, 2, 8, 4};
        //1, 2, 4, 8, 11, -2, -3
        List<Integer> missingNumbers = findFirstKMissingNumber(array, 7);
        missingNumbers.stream().forEach(num -> System.out.print(num+" ->"));
    }

    private static List<Integer> findFirstKMissingNumber(int[] array, int k) {
        if(array ==  null || array.length == 0 || k < 1){
            return new ArrayList<>();
        }

        for(int i=0; i< array.length; i++){
            if(array[i] > 0 && array[i] < array.length && array[i]-1 != i){
                int otherIndex = array[i] - 1;

                int temp = array[i];
                array[i] = array[otherIndex];
                array[otherIndex] = temp;
            }
        }

        List<Integer> missingNumber = new ArrayList<>();
        Set<Integer> lookup = new HashSet<>();

        int index = 0;
        for( ; index< array.length && missingNumber.size() < k; index++ ){
            if(array[index] != index+1){
                missingNumber.add(index+1);
                lookup.add(array[index]);
                k--;
            }
        }

        for(; k > 0; index++){
            if(!lookup.contains(index+1)){
                missingNumber.add(index+1);
                k--;
            }
        }


        System.out.println("current size of missing number :: "+ missingNumber.size());
        return missingNumber;
    }
}

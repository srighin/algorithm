package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortElementBasedOnFrequency {
    public static void main(String[] args) {
        Integer [] array = {10, 7 , 10, 11, 10, 7, 5 , 6};
        sortElementBasedOnFrequency(array);
        printArray(array);

        System.out.println();
        List<Integer> list = Arrays.asList(10, 7 , 10, 11, 10, 7, 5 , 6);
        sortElementBasedOnFrequency1(list);
        list.stream().forEach(num -> System.out.print(num+" => "));
    }

    private static void sortElementBasedOnFrequency1(List<Integer> array) {
        Map<Integer, Integer> lookup = new HashMap<>();
        for(int num: array){
            lookup.put(num, lookup.getOrDefault(num, 0)+1);
        }

        array.sort((a, b) -> {
            if(lookup.get(b) != lookup.get(a)){
                return lookup.get(b) - lookup.get(a) > 0 ? 1 : -1;
            }else {
                return array.indexOf(a) - array.indexOf(b);
            }
        });
    }

    private static void sortElementBasedOnFrequency(Integer[] array) {
        Map<Integer, Integer> lookup = new HashMap<>();
        for(int num: array){
            lookup.put(num, lookup.getOrDefault(num, 0)+1);
        }

        Arrays.sort(array, (a, b) -> {
             int num = lookup.get(b) - lookup.get(a);
             return num > 0 ? 1 : -1;
        });
    }

    private static void printArray(Integer[] shuffleArray) {
        for (int num :
                shuffleArray) {
            System.out.print(num+ " ->");
        }
    }
}

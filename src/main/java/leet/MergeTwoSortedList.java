package leet;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MergeTwoSortedList {

    public static void main(String[] args) {
        List<Integer> l1 = Stream.of(1, 2, 4).collect(Collectors.toList());
        List<Integer> l2 = Stream.of(1, 3, 5).collect(Collectors.toList());

        int[] mergeTwoSortedList = mergeTwoSortedList(l1, l2);

        IntStream.of(mergeTwoSortedList).forEach(System.out:: print);
    }

    private static int[] mergeTwoSortedList(List<Integer> l1, List<Integer> l2) {
        int l1StartIndex = 0;
        int l2StartIndex = 0;
        int resultIndex = 0;
        int [] resultArray = new int[l1.size()+l2.size()];

        while(l1StartIndex< l1.size() && l2StartIndex < l2.size()){

            if(l1.get(l1StartIndex) < l2.get(l2StartIndex)){
                resultArray[resultIndex++] = l1.get(l1StartIndex++);
            }else {
                resultArray[resultIndex++] = l2.get(l2StartIndex++);
            }
        }

        while(l1StartIndex< l1.size()){
            resultArray[resultIndex++] = l1.get(l1StartIndex++);
        }

        while(l2StartIndex< l2.size()){
            resultArray[resultIndex++] = l2.get(l2StartIndex++);
        }

        return resultArray;
    }
}

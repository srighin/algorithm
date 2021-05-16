package heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class TopKLargestElementInArray {
    public static void main(String[] args) {
        int [] array = {8, 10, 7, 8, 11, 30, 11, 8, 38, 11,2, 45, 2, 8};
        List<Integer> topKthElement = findTopKElement(array, 5);
        topKthElement.stream().forEach(num -> System.out.print(num+" -> "));
        Arrays.sort(array);
        System.out.println();
        for (int num: array){
            System.out.print(num+" -> ");
        }
    }

    private static List<Integer> findTopKElement(int[] array, int kth) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int index= 0;
        while (index < kth){
            minHeap.add(array[index++]);
        }

        while (index < array.length){
            if(array[index] > minHeap.peek()){
                minHeap.poll();
                minHeap.add(array[index]);
            }
            index++;
        }

        List<Integer> result =  new ArrayList<>();

        while (!minHeap.isEmpty()){
            result.add(minHeap.poll());
        }
        return result;
    }
}

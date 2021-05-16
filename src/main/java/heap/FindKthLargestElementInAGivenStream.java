package heap;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class FindKthLargestElementInAGivenStream {


    public static void main(String[] args) {
        int[] numbers = {10, 7, 11, 5, 27, 9, 8, 45};

        int kth = 3;
        int kthLargestNumberInArray = findKthLargestElement(numbers, kth);
        System.out.println("Largest:: "+kthLargestNumberInArray);

        System.out.println("---------------------------------");

        int kthSmallestElement = findKthSmallestElement(numbers, kth);
        System.out.println("Smallest:: "+kthSmallestElement);

        Arrays.sort(numbers);
        for(int num: numbers){
            System.out.print(num+" -> ");
        }
    }

    private static int findKthSmallestElement(int[] numbers, int kth) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        int index = 0;
        while (index < kth){
            maxHeap.add(numbers[index]);
            index++;
        }

        while (index< numbers.length){
            if(numbers[index] < maxHeap.peek()){
                maxHeap.poll();
                maxHeap.add(numbers[index]);
            }
            index++;
        }
        return maxHeap.peek();
    }

    private static int findKthLargestElement(int[] numbers, int kth) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int index = 0;
        while (index < kth){
            minHeap.add(numbers[index]);
            index++;
        }

        while (index< numbers.length){
            if(numbers[index] > minHeap.peek()){
                minHeap.poll();
                minHeap.add(numbers[index]);
            }
            index++;
        }
        return minHeap.peek();
    }


}

package leet;

import java.util.Arrays;
import java.util.PriorityQueue;

public class FindKthLargest {


    public static void main(String[] args) {
        int [] numbers = {1, 2, 5 ,9 ,3, 16};
        int kth = 6;
        int kthLargest = getKthLargestElementUsingPriorityQueue(numbers, kth);
        System.out.println(kthLargest);

        kthLargest = findKthElement(numbers, kth);
        System.out.println(kthLargest);
    }

    private static int getKthLargestElementUsingPriorityQueue(int[] numbers, int k) {

        PriorityQueue<Integer> meanHeap = new PriorityQueue<>();
        for(int i=0; i< numbers.length; i++){
            meanHeap.add(numbers[i]);
            if(meanHeap.size() > k){
                meanHeap.remove();
            }
        }
        return meanHeap.remove();
    }

    private static int findKthElement(int [] arr, int k){
        Arrays.sort(arr);
        return arr[arr.length - k];
    }
}

package heap;

import java.util.PriorityQueue;

public class HeapDemo {

    private static PriorityQueue<Integer> queue;

    public static void main(String[] args) {
        int[] arr = {10, 2, 13, 29, 100};
        queue = new PriorityQueue<>(5, (a, b) -> a < b ? -1 : 1);
        int result = getKthLargestElement(arr, 4);
        System.out.println(result);
    }

    private static int getKthLargestElement(int[] arr, int kth) {

       for (int i=0; i< arr.length; i++){
           if(i< kth){
               queue.add(arr[i]);
           }else {
               if(arr[i] > queue.peek()){
                   queue.poll();
                   queue.add(arr[i]);
               }
           }
       }
       return queue.peek();
    }
}

package heap;

import java.util.PriorityQueue;

public class FindKthLargestElementInAGivenStream {

    private static PriorityQueue<Integer> queue;

    public static void main(String[] args) {
        queue = new PriorityQueue<>();
        int[] numbers = {10, 7, 11, 5, 27, 9, 8, 45};
        int kth = 3;
        for (int num : numbers) {
            System.out.println(findKthLargestElement(num, kth));
        }
    }

    private static int findKthLargestElement(int num, int kth) {
        if (queue.size() < kth) {
            queue.add(num);
            return queue.size() == kth ? queue.peek() : -1;
        }

        if (num > queue.peek()) {
            queue.poll();
            queue.add(num);
        }

        return queue.peek();
    }
}

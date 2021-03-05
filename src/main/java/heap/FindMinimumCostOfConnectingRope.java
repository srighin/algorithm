package heap;

import java.util.PriorityQueue;

public class FindMinimumCostOfConnectingRope {

    public static void main(String[] args) {
        int [] ropes = {3, 4,7, 2};
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int rope: ropes){
            minHeap.add(rope);
        }
        int sum = 0;

        while (minHeap.size()>1){
            int tempSum = minHeap.poll()+minHeap.poll();
            sum+=tempSum;
            minHeap.add(tempSum);
        }

        System.out.println("Min cost of adding rope: "+sum);

    }
}

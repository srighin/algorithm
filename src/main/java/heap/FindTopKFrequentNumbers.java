package heap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class FindTopKFrequentNumbers {

    public static void main(String[] args) {
        int [] numbers = {8, 10, 7, 8, 11, 30, 11, 8, 38, 11,2, 45, 2, 8};
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(5, (a, b) ->   a.getValue() -b.getValue() >0 ? 1 : -1);
        Map<Integer, Integer> lookup = new HashMap<>();
        for (int num: numbers){
            lookup.put(num, lookup.getOrDefault(num, 0)+1);
        }

        int kth = 3;

        for(Map.Entry<Integer, Integer> entry: lookup.entrySet()){
            if(minHeap.size() < kth){
                minHeap.add(entry);
            }else{
                if(entry.getValue() > minHeap.peek().getValue()){
                    minHeap.poll();
                    minHeap.add(entry);
                }
            }
        }

        while (!minHeap.isEmpty()){
            Map.Entry<Integer, Integer> min = minHeap.poll();
            System.out.println("Element: "+min.getKey()+" frequency: "+min.getValue());
        }

    }
}

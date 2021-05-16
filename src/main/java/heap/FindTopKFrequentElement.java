package heap;


import java.util.*;

public class FindTopKFrequentElement {
    public static void main(String[] args) {
        int [] array = {8, 10, 7, 8, 11, 30, 11, 8, 38, 11,2, 45, 2, 8};
        int kth =3;

        List<Integer> topKthElement = findTopKFrequentElement(array, kth);
        topKthElement.stream().forEach(num -> System.out.print(num+"->"));
        System.out.println();
        Arrays.sort(array);
        for (int num: array){
            System.out.print(num+ " ->");
        }

    }

    private static List<Integer> findTopKFrequentElement(int[] array, int kth) {
        Map<Integer, Integer> lookup = new HashMap<>();
        for (int num: array){
            lookup.put(num, lookup.getOrDefault(num, 0)+1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>((a, b) -> b.getValue()- a.getValue());

        maxHeap.addAll(lookup.entrySet());
        int index = 0;
        List<Integer> result = new ArrayList<>();
        while (index< kth && !maxHeap.isEmpty()){
            result.add(maxHeap.poll().getKey());
            index++;
        }

        return result;
    }
}

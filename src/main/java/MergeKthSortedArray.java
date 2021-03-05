import java.util.*;

public class MergeKthSortedArray {
    public static void main(String[] args) {
        List<Integer> sortedArray1 = Arrays.asList(1, 2, 3, 20);
        List<Integer> sortedArray2 = Arrays.asList(4, 6, 7, 8, 9);

        List<List<Integer>> input = new ArrayList<>();
        input.add(sortedArray1);
        input.add(sortedArray2);

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((x, y)-> -Long.compare(x, y));

        input.forEach((list) -> {
            list.forEach((num) -> maxHeap.add(num));
        });
        List<Integer> result = new ArrayList<>();
        while(maxHeap.size() > 0){
            result.add(maxHeap.remove());
        }

        result.forEach(System.out::print);
    }
}

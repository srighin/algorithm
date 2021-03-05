import java.util.*;

public class FindKthHeavyHitter {

    public static void main(String[] args) {

        int[] events = {1, 1, 1, 1, 2, 2, 3, 4, 5, 6, 7, 8, 9};
        int kth = 3;
        Map<Integer, Integer> lookup = new HashMap<>();
        Arrays.stream(events).forEach((e)-> lookup.put(e, lookup.getOrDefault(e, 0)+1));
        PriorityQueue<HeavyHitter> heap = new PriorityQueue<>(Comparator.comparing(HeavyHitter::getFrequency));
        lookup.forEach((k, v) -> {
            heap.add(new HeavyHitter(k, v));

            if(heap.size()> kth){
                heap.poll();
            }
        });
        List<HeavyHitter> result = new LinkedList<>();
        while(heap.size() > 0){
            result.add(heap.remove());
        }
        result.forEach(System.out::println);
    }
}

class HeavyHitter {
    public int id;
    public int frequency;

    public HeavyHitter(int id, int frequency) {
        this.id = id;
        this.frequency = frequency;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", frequency=" + frequency +
                '}';
    }
}

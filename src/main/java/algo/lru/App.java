package algo.lru;

public class App {
    public static void main(String[] args) {
        LRUImpl cache = new LRUImpl();

        cache.put(1, "A");
        cache.put(2, "B");
        cache.put(3, "C");
        cache.put(4, "D");
        cache.put(5, "E");
        cache.put(6, "F");
        cache.show();
        System.out.println();

        System.out.println(cache.get(6).getData());
        cache.show();
        System.out.println();

        System.out.println(cache.get(3).getData());
        cache.show();
        System.out.println();

        System.out.println(cache.get(4).getData());
        cache.show();
        System.out.println();

    }
}

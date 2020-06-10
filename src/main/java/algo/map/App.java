package algo.map;

public class App {

    public static void main(String[] args) {
        HashTable map = new HashTable();
        map.put(1, 12);
        map.put(2, 22);
        map.put(11, 32);
        map.put(4, 42);

        System.out.println(map.get(1).getValue());
    }
}

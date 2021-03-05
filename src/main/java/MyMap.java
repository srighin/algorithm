import java.util.Objects;

public class MyMap<K, V> {

    private static int CAPACITY;
    private int size = 0;

    Entry[] buckets;


    public MyMap() {
        this.CAPACITY = 16;
        buckets = new Entry[CAPACITY];
    }

    public MyMap(int capacity){
        this.CAPACITY = capacity;
        buckets = new Entry[CAPACITY];
    }

    public void put(K key, V value){
        Entry<K, V> newEntry = new Entry<>(key, value);

        int bucket = key.hashCode() % CAPACITY;

        Entry<K, V> existing = buckets[bucket];
        if(existing == null){
            buckets[bucket] = newEntry;
        }else {
            while(existing.getNext() != null){
                existing = existing.getNext();
            }
            if(existing.getKey().equals(key)){
                existing.setValue(value);
            }else{
                existing.setNext(newEntry);
            }

        }
    }


}

class Entry<K, V>{
    private K key;
    private V value;
    private Entry<K, V> next;

    public Entry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public Entry<K, V> getNext() {
        return next;
    }

    public void setNext(Entry<K, V> next) {
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entry<?, ?> entry = (Entry<?, ?>) o;
        return key.equals(entry.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key);
    }
}

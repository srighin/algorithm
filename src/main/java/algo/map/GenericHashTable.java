package algo.map;

public class GenericHashTable<K, V> {

    private K[] key;
    private V[] value;
    private int CAPACITY = 8;
    private int currentSize;

    public GenericHashTable() {
        this.key = (K[]) new Object[CAPACITY];
        this.value = (V[]) new Object[CAPACITY];
        this.currentSize = 0;
    }

    public GenericHashTable(int capacity) {
        this.key = (K[]) new Object[capacity];
        this.value = (V[]) new Object[capacity];
        this.CAPACITY = capacity;
        this.currentSize = 0;
    }

    public V get(K k){
        int index = hash(k);
        K keyValue = key[index];
        while(key[index] != null){
            if(!keyValue.equals(k)){
                index = (index+1) % this.CAPACITY;
            } else {
                return value[index];
            }
        }
        return null;
    }

    public int hash(K key){
        return key.hashCode() % this.CAPACITY;
    }

    public int size(){
        return this.currentSize;
    }

    public boolean isEmpty(){
        return this.currentSize == 0;
    }
}

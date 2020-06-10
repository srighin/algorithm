package algo.map;

public class HashTable {

    private static final int TABLE_SIZE = 8;

    private HashItem [] hashTable;

    public HashTable() {
        hashTable = new HashItem[TABLE_SIZE];
    }

    public void put(int key, int value){
        int hashIndex = hash(key);

        if (hashTable[hashIndex] == null){
            hashTable[hashIndex] = new HashItem(key, value);
        } else {
            HashItem hashItem = hashTable[hashIndex];
            while (hashItem.getNextHashItem() != null){
                hashItem = hashItem.getNextHashItem();
            }
            hashItem.setNextHashItem(new HashItem(key, value));
        }
    }

    public HashItem get(int key){
        int hashIndex = hash(key);

        HashItem hashItem = hashTable[hashIndex];

        while(hashItem != null){
            if (hashItem.getKey() == key){
                return hashItem;
            }else {
                hashItem = hashItem.getNextHashItem();
            }
        }
        return null;
    }

    private int hash(int key){
        return key % TABLE_SIZE;
    }
}

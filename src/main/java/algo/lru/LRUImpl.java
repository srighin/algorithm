package algo.lru;

import java.util.HashMap;
import java.util.Map;

public class LRUImpl<T> {

    private int actualSize;
    private DoublyLinkedList list;
    private Map<Integer, Node> hashtable;
    private static int MAX_QUEUE_SIZE = 5;

    public LRUImpl() {
        this.list = new DoublyLinkedList();
        this.hashtable = new HashMap<>();
    }

    public void put(int id, T data){
       // check if the data is present in the map
        if(hashtable.containsKey(id)){
            Node node = hashtable.get(id);
            node.setData(data);
            update(node);
            return;
        }

        Node<T> newNode = new Node<>(id, data);

        if(actualSize < MAX_QUEUE_SIZE){
            this.actualSize++;
            add(newNode);
        } else {
            removeTail();
            add(newNode);
        }
    }

    private void removeTail() {
        Node<Node> tail = this.list.getTail();
        Node<Node> previousNode = tail.getPreviousNode();
        previousNode.setNextNode(null);
        list.setTail(previousNode);

        tail = null;
    }

    public Node<T> get(int id){
        if(!this.hashtable.containsKey(id))
            return null;

        Node node = this.hashtable.get(id);
        update(node);
        return node;
    }

    private void add(Node<T> newNode) {
        newNode.setNextNode(this.list.getHead());
        newNode.setPreviousNode(null);
        if(this.list.getHead() != null){
            this.list.getHead().setPreviousNode(newNode);
        }
        this.list.setHead(newNode);

        if(this.list.getTail() == null){
            this.list.setTail(newNode);
        }
        this.hashtable.put(newNode.getId(), newNode);
    }

    private void update(Node node) {
        Node previousNode = node.getPreviousNode();
        Node nextNode = node.getNextNode();

        if(previousNode == null){
            this.list.setHead(nextNode);
        } else {
            previousNode.setNextNode(nextNode);
        }

        if(nextNode == null){
            this.list.setTail(previousNode);
        } else {
            nextNode.setPreviousNode(previousNode);
        }

        add(node);
    }

    public void show(){
        Node currentNode = this.list.getHead();
        while(currentNode != null){
            System.out.print(currentNode.getData()+" -> ");
            currentNode = currentNode.getNextNode();
        }
    }
}

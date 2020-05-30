package algo.queue;

public class CustomQueue<T extends Comparable<T>> {

    private Node<T> firstNode;
    private Node<T> lastNode;
    private int size;

    public void enqueue(T data){
        this.size++;
        Node<T> newNode = new Node<>(data);
        if (isEmpty()){
            firstNode = newNode;
            lastNode = firstNode;
        }else {
            lastNode.setNextNode(newNode);
            lastNode=lastNode.getNextNode();
        }
    }

    public void traverse(){
        Node<T> current = this.firstNode;
        while(current != null){
            System.out.print(current.getData()+" - ");
            current = current.getNextNode();
        }
    }

    public T dequeue(){

        if(isEmpty()){
            this.lastNode = null;
            throw new RuntimeException("Dequeue is over run");
        }
        T data = this.firstNode.getData();
        this.firstNode = this.firstNode.getNextNode();
        this.size--;
        return data;
    }

    public int size(){
        return this.size;
    }

    private boolean isEmpty() {
        return this.firstNode == null;
    }

}

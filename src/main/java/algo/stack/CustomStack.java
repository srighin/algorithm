package algo.stack;

public class CustomStack<T extends Comparable<T>> {

    private Node<T> root;
    private int size;

    public void push(T data){
        this.size++;
        if (this.root == null){
            Node<T> newNode = new Node<>(data);
            this.root = newNode;
        } else {
            Node<T> oldRoot = this.root;
            Node<T> newNode =  new Node<>(data);
            newNode.setNextNode(oldRoot);
            this.root = newNode;
        }
    }
    public T pop(){
        T data = this.root.getData();
        this.root = this.root.getNextNode();
        this.size--;
        return data;
    }

    public int getSize(){
        return this.size;
    }


}

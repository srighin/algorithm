package algo.list;

public class LinkedList<T extends Comparable<T>> implements List<T>{

    private Node<T> root;
    private int size;

    @Override
    public void add(T data) {
        if(root == null){
            root = new Node<T>(data);
        } else {
            insertDataInBegining(data);
            // insertElementAtEnd(root, data);
        }
    }

    @Override
    public T getMiddleElement(){
        Node<T> slowPointer = this.root;
        Node<T> fastPointer = this.root;

        while(fastPointer.getNextNode() != null && fastPointer.getNextNode().getNextNode() != null){
            fastPointer = fastPointer.getNextNode().getNextNode();
            slowPointer = slowPointer.getNextNode();
        }
        return slowPointer.getData();
    }

    private void insertDataInBegining(T data){
        Node<T> newNode = new Node<>(data);
        newNode.setNextNode(root);
        this.root = newNode;
    }

    private void insertElementAtEnd(Node<T> node, T data) {

        Node<T> nextNode = node.getNextNode();
        if(nextNode != null){
            insertElementAtEnd(nextNode, data);
        } else {
            node.setNextNode(new Node<>(data));
        }

    }

    public Node<T> getRoot() {
        return root;
    }

    @Override
    public void reverse() {

        Node<T> prev = null;
        Node<T> next = null;
        Node<T> current = this.root;

        while(current != null){
            next = current.getNextNode();
            current.setNextNode(prev);
            prev = current;
            current = next;
        }
        this.root = prev;

    }

    @Override
    public void remove(T data) {

        if (root.getData().compareTo(data) == 0){
            this.root = this.root.getNextNode();
        } else {
            removeData(data, root, root.getNextNode());
        }
    }

    private void removeData(T data, Node<T> previousNode, Node<T> currentNode) {

        while(currentNode != null){
            if(currentNode.getData().compareTo(data) == 0){
                previousNode.setNextNode(currentNode.getNextNode());
                size --;
                return;
            } else {
                previousNode = currentNode;
                currentNode = currentNode.getNextNode();
            }
        }
    }

    @Override
    public void traverse() {
        if(root == null){
            return;
        }

        Node<T> currentNode = this.root;
        while(currentNode != null){
            System.out.print(currentNode.getData()+" - ");
            currentNode = currentNode.getNextNode();
        }
    }

    @Override
    public int size() {
        return this.size;
    }
}

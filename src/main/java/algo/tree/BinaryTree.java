package algo.tree;

public class BinaryTree<T extends Comparable<T>> implements Tree<T> {

    private Node<T> root;

    @Override
    public void insert(T data) {

        if(root == null){
            root = new Node<>(data);
        } else {
            insertData(data, root);
        }

    }

    private void insertData(T data, Node<T> node) {

        if (data.compareTo(node.getData())< 0){
            if (node.getLeft() != null){
                insertData(data, node.getLeft());
            } else {
                node.setLeft(new Node<>(data));
            }
        } else {
            if (node.getRight() != null){
                insertData(data, node.getRight());
            } else {
                node.setRight(new Node<>(data));
            }
        }
    }

    @Override
    public int sumAllEdges() {
        return sumAllEdges(root);
    }

    private int sumAllEdges(Node<T> node) {
        return  node == null ? 0: (Integer) node.getData()+sumAllEdges(node.getLeft()) + sumAllEdges(node.getRight());
    }

    @Override
    public T findKthSmallestElement(int kth) {
        if (kth <= 0)
            throw new RuntimeException("Index should be greater than 0");
        return getKthSmallest(root, kth);
    }

    private T getKthSmallest(Node<T> node, int kth) {
        int sizeOfLeftSubtree = sizeOfLeftSubtree(node.getLeft())+1;
        if(sizeOfLeftSubtree == kth){
            return node.getData();
        } else if(sizeOfLeftSubtree > kth){
            return getKthSmallest(node.getLeft(), kth);
        } else {
            return getKthSmallest(node.getRight(), (kth-sizeOfLeftSubtree));
        }

    }

    private int sizeOfLeftSubtree(Node<T> node) {
        if(node == null)
            return 0;
        return sizeOfLeftSubtree(node.getLeft())+sizeOfLeftSubtree(node.getRight())+1;
    }

    @Override
    public Node<T> getRoot() {
        return root;
    }

    private Node<T> deleteNode(Node<T> node, T data) {

        if (node == null)
            return node;

        if(data.compareTo(node.getData())< 0){
            node.setLeft(deleteNode(node.getLeft(), data));
        } else if (data.compareTo(node.getData())> 0){
            node.setRight(deleteNode(node.getRight(), data));
        } else {
            if (node.getLeft() == null && node.getRight() == null){
                System.out.println("Both left and right is null");
                return null;
            } else if(node.getLeft() == null){
                System.out.println("Left child is null");
                Node<T> temp = node.getRight();
                node = null;
                return temp;
            } else if(node.getRight() == null){
                System.out.println("Right child is null");
                Node<T> temp = node.getLeft();
                node = null;
                return temp;
            } else {
                Node<T> temp = getPredecessor(node.getLeft());
                node.setData(temp.getData());
                node.setLeft(deleteNode(node.getLeft(), temp.getData()));
            }
        }
        return node;
    }

    private Node<T> getPredecessor(Node<T> node) {

        if(node.getRight() != null){
            return getPredecessor(node.getRight());
        }
        System.out.println("Predecessor is: "+node.getData());
        return node;
    }

    @Override
    public Node<T> delete(T data) {
        if (root == null)
            return null;
        else {
            return deleteNode(root, data);
        }
    }

    @Override
    public void traverse() {

        if (root == null) {
            return;
        } else {
            traverse(root);
        }

    }

    private void traverse(Node<T> node) {
        if (node.getLeft() != null)
            traverse(node.getLeft());

        System.out.print(node.getData() +" -> ");

        if(node.getRight() != null)
            traverse(node.getRight());
    }

    @Override
    public T getMax() {
        if (root == null){
            return null;
        } else {
            return getMaxNode(root);
        }
    }

    private T getMaxNode(Node<T> node) {
        Node<T> currentNode = node;
        while(currentNode.getRight() != null){
            currentNode = node.getRight();
        }
        return currentNode.getData();
    }


    @Override
    public T getMin() {
        if (root == null){
            return null;
        } else {
            return getMinNode(root);
        }
    }

    private T getMinNode(Node<T> node) {
        if (node.getLeft() == null){
            return node.getData();
        }
        return getMinNode(node.getLeft());
    }
}

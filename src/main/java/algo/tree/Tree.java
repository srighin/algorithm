package algo.tree;

public interface Tree<T> {

    Node<T> getRoot();
    T findKthSmallestElement(int k);
    void insert(T data);
    Node<T> delete(T data);
    void traverse();
    int sumAllEdges();
    T getMax();
    T getMin();

}

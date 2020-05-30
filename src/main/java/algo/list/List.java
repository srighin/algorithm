package algo.list;

public interface List<T> {

    void add(T data);
    void remove(T data);
    void traverse();
    int size();
    T getMiddleElement();
    void reverse();

}

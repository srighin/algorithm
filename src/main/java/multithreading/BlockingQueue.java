package multithreading;

import java.util.LinkedList;
import java.util.Queue;

public class BlockingQueue<T> {

    private Queue<T> queue;
    private int CAPACITY;

    public BlockingQueue(int size) {
        this.CAPACITY = size;
        queue = new LinkedList<>();
    }

    public void put(T element) throws InterruptedException {
        if(queue.size() == CAPACITY){
            wait();
        }
        queue.add(element);
        notifyAll();
    }

    public T get() throws InterruptedException {
        if(queue.size() == 0){
            wait();
        }
        T element = queue.remove();
        notifyAll();
        return element;
    }
}

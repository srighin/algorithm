package algo.queue;

public class App {

    public static void main(String[] args) {
        CustomQueue<String> queue = new CustomQueue<>();
        queue.enqueue("One");
        queue.enqueue("two");
        queue.enqueue("Three");

        System.out.println(queue.size());
        queue.traverse();

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.size());
    }
}

package algo.queue;

public class AppUsingStack {
    public static void main(String[] args) {
        QueueUsingStack queueUsingStack = new QueueUsingStack();
        queueUsingStack.enque(10);
        queueUsingStack.enque(20);
        queueUsingStack.enque(30);
        queueUsingStack.enque(50);

        System.out.println(queueUsingStack.dequeue());
        System.out.println(queueUsingStack.dequeue());
        System.out.println(queueUsingStack.dequeue());
        queueUsingStack.enque(80);
        queueUsingStack.enque(12);

        System.out.println(queueUsingStack.dequeue());
        System.out.println(queueUsingStack.dequeue());
        System.out.println(queueUsingStack.dequeue());

    }
}

package algo.queue;

import java.util.Stack;

public class QueueUsingStack {

    private Stack<Integer> enqueStack;
    private Stack<Integer> dequeStack;

    public QueueUsingStack() {
        this.enqueStack = new Stack<>();
        this.dequeStack = new Stack<>();
    }

    public void enque(Integer data){
        enqueStack.push(data);
    }

    public Integer dequeue(){
        if (dequeStack.isEmpty() && enqueStack.isEmpty()){
            throw new RuntimeException("Queue is empty");
        }
        if(dequeStack.isEmpty()){
            while (!enqueStack.isEmpty()){
                dequeStack.push(enqueStack.pop());
            }
        }
        return dequeStack.pop();
    }
}

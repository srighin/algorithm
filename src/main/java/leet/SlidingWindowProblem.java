package leet;

import java.util.LinkedList;
import java.util.Queue;

public class SlidingWindowProblem {

    private Queue<Integer> queue;
    private int maxSize;
    private double sum;

    public SlidingWindowProblem(int maxSize) {
        queue = new LinkedList<>();
        this.maxSize = maxSize;
    }

    public static void main(String[] args) {
        SlidingWindowProblem windowProblem = new SlidingWindowProblem(3);
        System.out.println(windowProblem.nextVal(1));
        System.out.println(windowProblem.nextVal(10));
        System.out.println(windowProblem.nextVal(20));
        System.out.println(windowProblem.nextVal(40));
    }

    private  double nextVal(int val){

        if(queue.size() == maxSize){
            sum = sum - queue.remove();
        }

        sum+=val;
        queue.add(val);
        return sum/queue.size();

    }
}

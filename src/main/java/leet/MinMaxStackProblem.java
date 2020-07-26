package leet;

import java.util.Stack;

public class MinMaxStackProblem {

    public static void main(String[] args) {

        MinMaxStack minMaxStack = new MinMaxStack();
        minMaxStack.push(5);
        System.out.println(minMaxStack.getMin());
        System.out.println(minMaxStack.getMax());
        System.out.println(minMaxStack.peek());
        minMaxStack.push(7);
        System.out.println(minMaxStack.getMin());
        System.out.println(minMaxStack.getMax());
        System.out.println(minMaxStack.peek());

        minMaxStack.push(2);
        System.out.println(minMaxStack.getMin());
        System.out.println(minMaxStack.getMax());
        System.out.println(minMaxStack.peek());
        System.out.println(minMaxStack.pop());
        System.out.println(minMaxStack.pop());

        System.out.println(minMaxStack.getMin());
        System.out.println(minMaxStack.getMax());
        System.out.println(minMaxStack.peek());
    }

    static class MinMaxStack {

        private Stack<Integer> stack = new Stack<>();
        private Stack<Integer> minStack = new Stack<>();
        private Stack<Integer> maxStack = new Stack<>();

        public int peek() {
           if(!stack.isEmpty()){
              return stack.peek();
           }
           throw new RuntimeException("stack is empty");
        }

        public int pop() {
            if (!minStack.isEmpty() && !maxStack.isEmpty() && !stack.isEmpty()){
                minStack.pop();
                maxStack.pop();
                return stack.pop();
            }
            throw new RuntimeException("stack is empty");
        }

        public void push(Integer number) {
            stack.push(number);

            if(maxStack.isEmpty() || number > maxStack.peek()){
                maxStack.push(number);
            }else if(number <= maxStack.peek()){
                maxStack.push(maxStack.peek());
            }

            if(minStack.isEmpty() || number < minStack.peek()){
                minStack.push(number);
            } else if(number >= minStack.peek()){
                minStack.push(minStack.peek());
            }
        }

        public int getMin() {
            if(!minStack.isEmpty()){
                return minStack.peek();
            }
            throw new RuntimeException("stack is empty");
        }

        public int getMax() {
            if(!maxStack.isEmpty()){
                return maxStack.peek();
            }
            throw new RuntimeException("stack is empty");
        }
    }
}

package algo.stack;

import java.util.Stack;

public class MaxElementInStack {

    Stack<Integer> mainStack;
    Stack<Integer> maxStack;

    public MaxElementInStack() {
        this.mainStack = new Stack<>();
        this.maxStack = new Stack<>();
    }

    public void push(Integer data){
        this.mainStack.push(data);

        if(maxStack.size() == 0){
            maxStack.push(data);
            return;
        }
        Integer currentMaxValue = this.maxStack.peek();
        if (currentMaxValue < data){
            maxStack.push(data);
        } else {
            maxStack.push(currentMaxValue);
        }
    }

    public Integer pop(){
        if (this.mainStack.empty()){
            throw  new RuntimeException("Stack is empty");
        }
        Integer returnVal = this.mainStack.pop();
        this.maxStack.pop();
        return returnVal;
    }

    public Integer getMax(){
        if (mainStack.empty()){
            return null;
        }
        return this.maxStack.peek();
    }
}

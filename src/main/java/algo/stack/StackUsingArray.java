package algo.stack;


import java.util.Arrays;

public class StackUsingArray<T> {

    private T[] stack;
    private int sizeOfStack;

    public StackUsingArray(int s) {
        this.stack = (T[]) new Object[s];
    }

    public void push(T data){
        if (stack.length == sizeOfStack){
            resize(2* sizeOfStack);
        }
        this.stack[sizeOfStack++] = data;
    }

    private void resize(int size) {
       /* T[] newStack = (T[]) new Object[size];
        for (int i=0; i< sizeOfStack; i++){
            newStack[i] = stack[i];
        }
        stack=newStack;*/
        stack = Arrays.copyOf(stack, size);
    }

    public T pop(){
        T data = stack[--this.sizeOfStack];
        return data;
    }

    public int size(){
        return this.sizeOfStack;
    }
}

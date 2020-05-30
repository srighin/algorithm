package algo.stack;

public class AppMaxElement {
    public static void main(String[] args) {
        MaxElementInStack stack = new MaxElementInStack();
        stack.push(10);
        stack.push(2);
        stack.push(27);
        stack.push(50);
        stack.push(100);
        stack.push(29);
        stack.push(101);

        //System.out.println(stack.getMax());

        System.out.println(stack.getMax());
    }
}

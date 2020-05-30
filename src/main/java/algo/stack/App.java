package algo.stack;

public class App {
    public static void main(String[] args) {
       /* CustomStack<String> stack = new CustomStack<>();
        stack.push("Sriman");
        stack.push("Rithika");
        stack.push("Shilpi");

        System.out.println(stack.getSize());
        System.out.println(stack.pop());*/

       StackUsingArray stringStackUsingArray = new StackUsingArray(2);
       stringStackUsingArray.push("One");
       stringStackUsingArray.push("Two");
       stringStackUsingArray.push("Three");
       stringStackUsingArray.push("Three");
       stringStackUsingArray.push("Three");
       stringStackUsingArray.push("Three");
       stringStackUsingArray.push("Three");
       //stringStackUsingArray.pop();

       //stringStackUsingArray.push("Five");

        System.out.println(stringStackUsingArray.size());
    }
}

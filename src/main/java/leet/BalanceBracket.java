package leet;

import java.util.Stack;

public class BalanceBracket {

    public static void main(String[] args) {
        String str = "({[a]})";
        System.out.println(balancedBrackets(str));

    }

    public static boolean balancedBrackets(String str) {
        // Write your code here.
        char[] brackets = str.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (char ch: brackets){
            if(ch == '[' || ch == '{' || ch =='('){
                stack.push(ch);
            } else {
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.peek();
                if ((top == '(' && ch == ')') || (top == '{' && ch == '}') || (top == '[' && ch == ']')) {
                    stack.pop();
                } else if(Character.isAlphabetic(ch)){

                }else {
                    return false;
                }
            }
        }

        return stack.isEmpty() ? true: false;
    }

}

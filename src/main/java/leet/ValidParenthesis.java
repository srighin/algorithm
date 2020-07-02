package leet;

import java.util.Stack;

public class ValidParenthesis {

    public static void main(String[] args) {
        char [] str = {'(', '['};

        boolean isValid = isValidParenthesis(str);
        System.out.println(isValid);
    }

    private static boolean isValidParenthesis(char[] str) {
        Stack<Character> stack = new Stack<>();
        for (char ch: str){
            if(ch == '(' || ch == '{' || ch =='['){
                stack.push(ch);
            } else  if (ch == ')' && !stack.isEmpty() && stack.peek() =='('){
                stack.pop();
            }else  if (ch == '}' && !stack.isEmpty() && stack.peek() =='{'){
                stack.pop();
            }else  if (ch == ']' && !stack.isEmpty() && stack.peek() =='['){
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}

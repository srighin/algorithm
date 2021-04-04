package stack;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Coding Sample";
        String reverseStr = reverseString(str);
        System.out.println(reverseStr);
    }

    private static String reverseString(String str) {
        if (str == null){
            return null;
        }

        Stack<Character> stack = new Stack<>();
        char[] charArray = str.toCharArray();
        for(char ch: charArray){
            stack.push(ch);
        }

        StringBuilder sb = new StringBuilder();

        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}

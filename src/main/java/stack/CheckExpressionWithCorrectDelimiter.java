package stack;

import java.util.Stack;

public class CheckExpressionWithCorrectDelimiter {
    public static void main(String[] args) {
        String expression = "[a+{b-(c+d)}]";
        boolean hasCorrectDelimiter = checkForCorrectDelimiter(expression);
        System.out.println(hasCorrectDelimiter);

        expression = "[a+{b-c+d)}]";
        hasCorrectDelimiter = checkForCorrectDelimiter(expression);
        System.out.println(hasCorrectDelimiter);
    }

    private static boolean checkForCorrectDelimiter(String expression) {
        if(expression == null){
            return true;
        }
        int charIndex = 0;
        Stack<Character> delimiterStack = new Stack<>();
        while (charIndex < expression.length()){

                if(expression.charAt(charIndex) == ']'){
                    if(delimiterStack.isEmpty() || delimiterStack.peek() != '['){
                        return false;
                    }
                    delimiterStack.pop();
                } else if(expression.charAt(charIndex) == '}'){
                    if(delimiterStack.isEmpty() || delimiterStack.peek() != '{'){
                        return false;
                    }
                    delimiterStack.pop();
                } else if(expression.charAt(charIndex) == ')'){
                    if(delimiterStack.isEmpty() || delimiterStack.peek() != '('){
                        return false;
                    }
                    delimiterStack.pop();
                }
                if(expression.charAt(charIndex) == '[' ||
                expression.charAt(charIndex) == '{'||
                expression.charAt(charIndex) == '('){
                    delimiterStack.push(expression.charAt(charIndex));
                }
            charIndex++;
        }

        return true;
    }
}

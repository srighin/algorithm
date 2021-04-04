package stack;

import java.util.Stack;

public class ConvertInfixToPostFix {
    public static void main(String[] args) {
        String expression = "5+4*2";
        String postFixExpression = calculatePostFixFromInfix(expression);
        System.out.println(postFixExpression);
    }

    private static String calculatePostFixFromInfix(String expression) {
        int index = 0;
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        while (index < expression.length()) {
            if (Character.isDigit(expression.charAt(index))) {
                result.append(expression.charAt(index));
            } else {
                if (stack.isEmpty()) {
                    stack.push(expression.charAt(index));
                }
                while (!stack.isEmpty()) {
                    if (hasHigherPrecedence(stack.peek(), expression.charAt(index))) {
                        Character operator = stack.pop();
                        result.append(operator);
                    } else {
                        stack.push(expression.charAt(index));
                    }
                }
            }
            index++;
        }
        return result.toString();
    }

    private static boolean hasHigherPrecedence(Character peekElement, char currentCharacter) {
        if (currentCharacter == '+' || currentCharacter == '-' && peekElement == '*' || peekElement == '/') {
            return false;
        } else {
            return true;
        }
    }
}

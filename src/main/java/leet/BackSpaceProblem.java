package leet;

import java.util.Stack;

public class BackSpaceProblem {

    public static void main(String[] args) {
        String str1 = "ad#c";
        String str2 = "ab#c";

        boolean isSame = isEqual(str1, str2);
        System.out.println(isSame);
    }

    private static boolean isEqual(String str1, String str2) {
        Stack<Character> str1Chars = getStringCharacter(str1);
        Stack<Character> str2Chars = getStringCharacter(str2);

        while (!str1Chars.isEmpty()){
            if(!str2Chars.isEmpty() && !str1Chars.pop().equals(str2Chars.pop()) ){
                return false;
            }
        }

        return str1Chars.isEmpty() && str2Chars.isEmpty();
    }

    private static Stack<Character> getStringCharacter(String str) {
        Stack<Character> stack = new Stack<>();
        for(char ch: str.toCharArray()){
            if(ch != '#'){
                stack.push(ch);
            }else {
                stack.pop();
            }
        }
        return stack;
    }
}

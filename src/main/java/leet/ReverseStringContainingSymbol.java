package leet;

public class ReverseStringContainingSymbol {

    public static void main(String[] args) {
        String str = "a-ab-cd";
        String result = reverseString(str);
        System.out.println(result);
    }

    private static String reverseString(String str) {
        char[] ch = str.toCharArray();
        int i=0;
        int j=str.length() -1;

        while (i< j){
            while(i<j && !Character.isAlphabetic(str.charAt(i))){
                i++;
            }
            while(i< j && !Character.isAlphabetic(str.charAt(j))){
                j--;
            }

            char temp = str.charAt(i);
            ch[i++] = ch[j];
            ch[j--] = temp;
        }
        return new String(ch);
    }
}

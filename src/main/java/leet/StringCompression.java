package leet;

public class StringCompression {
    public static void main(String[] args) {
        //String str = "aabbbbcccccccc";
        String str = "abbbbbbbbbbbbb";
        String compressedStr = compressStr(str);
        System.out.println(compressedStr);
    }

    private static String compressStr(String str) {

        StringBuilder builder = new StringBuilder();
        int j = 0;
        int index = 0;
        int i = 0;
        while (i < str.length() && j< str.length()){
            j = i;
            builder.append(str.charAt(i));
            index++;
            while(j< str.length() && str.charAt(i) == str.charAt(j)){
                j++;
            }
            if((j-i) > 1){
                String count = (j-i)+"";
                for(char ch : count.toCharArray()){
                    builder.append(ch);
                    index++;
                }
            }
            i = j;
        }
        System.out.println(index);
        return builder.toString();
    }
}

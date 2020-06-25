package leet;

public class DefangIPAddress {
    public static void main(String[] args) {
        String ip = "10.0.12.13";

        StringBuilder stringBuilder = new StringBuilder();

        for(char ch : ip.toCharArray()){
            if(ch == '.'){
                stringBuilder.append("[.]");
            }else {
                stringBuilder.append(ch);
            }
        }

        System.out.println(stringBuilder.toString());
    }
}

package leet;

public class SumOfTwoString {

    public static void main(String[] args) {
        String sum = findTheSum("12", "129");
        System.out.println(sum);
    }

    private static String findTheSum(String str1, String str2) {
        int sum;
        int carry =0;
        StringBuilder result = new StringBuilder();

        int i = str1.length()-1;
        int j = str2.length()-1;

        while (i>=0 || j>=0){
            sum = carry;

            if(i>=0){
                //Subtract 0 which is 5 character away from the 0th character
                sum+=str1.charAt(i--) -'0';
            }

            if (j>=0){
                sum+=str2.charAt(j--) - '0';
            }
            result.append(sum%10);
            carry/=10;
        }
        return result.reverse().toString();

    }
}

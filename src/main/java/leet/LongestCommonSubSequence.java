package leet;

public class LongestCommonSubSequence {

    public static void main(String[] args) {
        String str1 = "abcdgh";
        String str2 = "acdghr";

        int maxLength = findTheLenghtOfLongestSubSequence(str1, str2);
        System.out.println(maxLength);
    }

    private static int findTheLenghtOfLongestSubSequence(String str1, String str2) {

        int maxLength = 0;
        int[][] matrix = new int[str1.length()][str2.length()];
        int x = 0;
        int y = 0;

        for(int i=0; i< str1.length(); i++){
            for(int j=0; j< str2.length(); j++){
                if(i==0){
                    matrix[i][j] = 0;
                }
                if(j==0){
                    matrix[i][j] = 0;
                }
            }
        }

        for(int i=1; i< str1.length(); i++){

            for(int j=1; j<str2.length(); j++){
                if(str1.charAt(i) == str2.charAt(j)){
                    matrix[i][j] = 1+ matrix[i-1][j-1];
                    if(maxLength < matrix[i][j]){
                        maxLength = matrix[i][j];
                        x= i;
                        y = j;
                    }
                } else {
                    matrix[i][j] = 0;
                }
            }
        }
        StringBuilder sb = new StringBuilder();

        while(matrix[x][y] > 0){
            sb.append(str1.charAt(x));
            x--;
            y--;
        }
        System.out.println(sb.reverse().toString());
        return maxLength;
    }
}

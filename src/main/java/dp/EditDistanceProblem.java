package dp;

public class EditDistanceProblem {
    public static void main(String[] args) {
        char[] str1 = {'M', 'A', 'R', 'C', 'h'};
        char[] str2 = {'C', 'A', 'R', 'T'};

        int[][] ed = new int[str1.length + 1][str2.length+1];

        for (int i = 0; i <= str1.length; i++) {
            for (int j = 0; j <= str2.length; j++) {
                if (i == 0) {
                    ed[i][j] = j;
                } else if (j == 0) {
                    ed[i][j] = i;
                } else if (str1[i - 1] == str2[j - 1]) {
                    ed[i][j] = ed[i - 1][j - 1];
                } else {
                    ed[i][j] = Math.min(Math.min(ed[i][j - 1], ed[i - 1][j]), ed[i - 1][j - 1])+1;
                }
            }
        }
        System.out.println(ed[str1.length][str2.length]);
    }
}

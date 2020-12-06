package sc;

public class LCSubsequence {

    public static void main(String[] args) {
        int [] arr = {99, 100, 1, 2, 101, 3, 102};
        int result = findLongestCommonSubsequence(arr);
        System.out.println(result);
    }

    private static int findLongestCommonSubsequence(int[] arr) {
        int [] lis = new int[arr.length];
        for(int i =0; i< arr.length; i++){
            lis[i] = 1;
        }

        for(int j=1; j< arr.length; j++){
            for(int i=0; i<j; i++){
                if(arr[j]> arr[i] && lis[i] <= lis[j]){
                    lis[j] = lis[i] +1;
                }
            }
        }
        int max = 0;
        for(int i: lis){
            if(max < i){
                max = i;
            }
        }
        return max;
    }
}

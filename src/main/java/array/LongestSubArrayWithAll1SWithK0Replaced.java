package array;

public class LongestSubArrayWithAll1SWithK0Replaced {
    public static void main(String[] args) {
        int [] array = {0,0 ,0, 1, 0, 1, 0, 1, 1, 1, 0};
        int maxLength = findMaxLength(array, 2);
        System.out.println(maxLength);
    }

    private static int findMaxLength(int[] array, int k) {
        int startIndex, endIndex, noOfZeros;
        startIndex = endIndex = noOfZeros = 0;
        int maxLength = 0;

        while (endIndex < array.length){
            if(array[endIndex] == 0){
                noOfZeros+=1;
            }

            if(noOfZeros > k){
                if(array[startIndex] == 0){
                    noOfZeros --;
                }
                startIndex++;
            }
            maxLength = endIndex - startIndex + 1;
            endIndex++;
        }
        return maxLength;
    }
}

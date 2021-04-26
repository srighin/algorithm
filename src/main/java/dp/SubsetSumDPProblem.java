package dp;

public class SubsetSumDPProblem {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 5};
        int targetSum = 50;
        boolean isSumSubsetExist = checkIfSubsetSumExist(array, targetSum, array.length);
        System.out.println("recursive approach :: "+ isSumSubsetExist);

        Boolean [][] lookup = new Boolean[targetSum+1][array.length+1];
        isSumSubsetExist = checkIfSubsetSumExistBottomUp(array, targetSum, array.length, lookup);
        System.out.println("topdown approach :: "+isSumSubsetExist);
    }

    private static boolean checkIfSubsetSumExistBottomUp(int[] array, int targetSum, int currentIndex, Boolean [][] lookup) {
        if(targetSum == 0 ){
            return true;
        }
        if(currentIndex <= 0 || targetSum < 0){
            return false;
        }
        if(lookup[targetSum][currentIndex] == null){
            if(array[currentIndex-1] <= targetSum ){
                lookup[targetSum][currentIndex] = checkIfSubsetSumExistBottomUp(array, targetSum - array[currentIndex-1], currentIndex-1, lookup);
                return lookup[targetSum][currentIndex];
            }
            lookup[targetSum][currentIndex] =  checkIfSubsetSumExistBottomUp(array, targetSum, currentIndex-1, lookup);
            return lookup[targetSum][currentIndex];
        }
        return lookup[targetSum][currentIndex];
    }

    private static boolean checkIfSubsetSumExist(int[] array, int targetSum, int currentIndex) {
        if(targetSum == 0 ){
            return true;
        }
        if(currentIndex <= 0 || targetSum < 0){
            return false;
        }
        if(array[currentIndex-1] <= targetSum && checkIfSubsetSumExist(array, targetSum - array[currentIndex-1], currentIndex-1)){
            return true;
        }
        return checkIfSubsetSumExist(array, targetSum, currentIndex-1);
    }
}

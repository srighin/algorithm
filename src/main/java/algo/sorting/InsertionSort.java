package algo.sorting;

/**
 * Best case O(n), average and worst case O(N2)
 */
public class InsertionSort implements Sort {
    @Override
    public int[] sort(int[] unsortedArray) {

        for(int i=0; i< unsortedArray.length; i++){
            int value = unsortedArray[i];
            int hole = i;

            while(hole > 0 && unsortedArray[hole-1] > value){
                swapElement(unsortedArray, hole-1, hole);
                hole --;
            }
        }
        return unsortedArray;
    }

    private void swapElement(int[] unsortedArray, int holeMinusOne, int hole) {
        int temp = unsortedArray[holeMinusOne];
        unsortedArray[holeMinusOne] = unsortedArray[hole];
        unsortedArray[hole] = temp;
    }
}

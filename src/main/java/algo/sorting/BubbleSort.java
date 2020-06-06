package algo.sorting;

/**
 * Best case O(n), average and worst case O(N2)
 */
public class BubbleSort implements Sort {
    @Override
    public int[] sort(int[] unsortedArray) {

        for(int k=0; k<unsortedArray.length; k++){

            //If the array is already sorted
            boolean isUnSorted = false;
            // sort till length-k-1
            for(int j=0; j< unsortedArray.length-k-1; j++){
                if(unsortedArray[j] > unsortedArray[j+1]){
                    swapElement(unsortedArray, j, j+1);
                    isUnSorted = true;
                }
            }
            //if the flag is true means the array is unsorted
            if(!isUnSorted)
                break;
        }
        return unsortedArray;
    }

    /**
     * Swap the array elements
     * @param unsortedArray
     * @param jth
     * @param jPlusOneth
     */
    private void swapElement(int[] unsortedArray, int jth, int jPlusOneth) {
        int temp  = unsortedArray[jth];
        unsortedArray[jth] = unsortedArray[jPlusOneth];
        unsortedArray[jPlusOneth ] = temp;
    }
}

package algo.sorting;

import java.util.Random;

/**
 * Time complexity : Average case(n LOG n), worst case O(n2)
 * Space complexity : worst case O(n) and average case (log n)
 */
public class QuickSort implements Sort {
    @Override
    public int[] sort(int[] unsortedArray) {
        quickSort(unsortedArray, 0, unsortedArray.length-1);
        return unsortedArray;
    }

    private void quickSort(int [] unsortedArray, int startIndex, int endIndex){
        if (startIndex < endIndex){
            int pIndex = partition(unsortedArray, startIndex, endIndex);
            quickSort(unsortedArray, startIndex, pIndex-1);
            quickSort(unsortedArray, pIndex +1, endIndex);
        }
    }

    private int partition(int[] unsortedArray, int startIndex, int endIndex) {
        //int pivot = random(startIndex, endIndex);
        int pivot = unsortedArray[endIndex];
        int pIndex = startIndex;

        for (int i=startIndex; i< endIndex; i++){
            if(unsortedArray[i] <= pivot){
                swapElement(unsortedArray, pIndex, i);
                pIndex++;
            }
        }
        swapElement(unsortedArray, pIndex, endIndex);
        return pIndex;
    }

    private void swapElement(int[] unsortedArray, int pIndex, int i) {
        int temp = unsortedArray[i];
        unsortedArray[i] = unsortedArray[pIndex];
        unsortedArray[pIndex]=temp;
    }

    /**
     * Randomized value of pivot element
     * @param startIndex
     * @param endIndex
     * @return
     */
    private int random(int startIndex, int endIndex){
        Random random = new Random();
        return random.nextInt(endIndex - startIndex) + startIndex;
    }
}

package algo.sorting;

/**
 * Time complexity : worst case O(nLOGn)
 * Space complexity : worst case O(n)
 */
public class MergeSort implements Sort {
    @Override
    public int[] sort(int[] unsortedArray) {

        mergeSort(unsortedArray);

        return unsortedArray;
    }

    private void mergeSort(int[] unsortedArray) {

        if(unsortedArray.length < 2 )
            return ;

        int mid = unsortedArray.length/2;
        int [] leftArray = new int[mid];
        int [] rightArray = new int[unsortedArray.length - mid];

        for(int i=0; i< mid; i++){
            leftArray[i] = unsortedArray[i];
        }

        for(int i=mid; i< unsortedArray.length; i++){
            rightArray[i-mid] = unsortedArray[i];
        }

        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(unsortedArray, leftArray, rightArray);

    }


    private void merge(int [] originalArray, int [] leftArray, int [] rightArray){
        int oIndex=0, leftIndex=0, rightIndex = 0;

        while(leftIndex < leftArray.length && rightIndex < rightArray.length){
            if(leftArray[leftIndex] <= rightArray[rightIndex]){
                originalArray[oIndex] = leftArray[leftIndex];
                leftIndex ++;
            } else {
                originalArray[oIndex] = rightArray[rightIndex];
                rightIndex++;
            }
            oIndex++;
        }

        while (leftIndex < leftArray.length){
            originalArray[oIndex] = leftArray[leftIndex];
            leftIndex ++;
            oIndex++;
        }
        while (rightIndex < rightArray.length){
            originalArray[oIndex] = rightArray[rightIndex];
            rightIndex++;
            oIndex++;
        }

       // return originalArray;
    }
}

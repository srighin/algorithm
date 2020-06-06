package algo.sorting;


public class SelectionSort implements Sort{

    public int [] sort(int [] unsortedArray){

        for(int i=0; i< unsortedArray.length-1; i++){
            int iMin = i;

            for(int j=i+1; j< unsortedArray.length; j++){
                if(unsortedArray[j] < unsortedArray[iMin]){
                    iMin = j;
                }
            }

            swapElement(unsortedArray, i, iMin);
        }
        return unsortedArray;
    }

    private void swapElement(int[] unsortedArray, int i, int iMin) {
        int temp = unsortedArray[i];
        unsortedArray[i] = unsortedArray[iMin];
        unsortedArray[iMin] = temp;
    }
}

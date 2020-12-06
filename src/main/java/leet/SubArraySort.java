package leet;

public class SubArraySort {


    public static void main(String[] args) {
        int [] arr = {1, 2, 4, 7, 10, 11, 7, 12,  6, 7, 16, 18, 19};
        int[] ints = subarraySort(arr);
        for (int i=0; i<ints.length; i++){
            System.out.println(ints[i]);
        }
    }

    public static int[] subarraySort(int[] array) {
        int unsortedMin = Integer.MAX_VALUE;
        int unsortedMax = Integer.MIN_VALUE;

        for(int i=0; i< array.length; i++){
            if(isCurrentElementIsNotSorted(i, array)){
                unsortedMin = Math.min(array[i], unsortedMin);
                unsortedMax = Math.max(array[i], unsortedMax);
            }
        }

        if(unsortedMin == Integer.MAX_VALUE){
            return new int []{-1, -1};
        }

        int minIndex = 0;
        while(array[minIndex] < unsortedMin){
            minIndex++;
        }

        int maxIndex = array.length -1;
        while (array[maxIndex] > unsortedMax){
            maxIndex --;
        }

        return new int[]{minIndex, maxIndex};
    }

    private static boolean isCurrentElementIsNotSorted(int index, int[] array) {
        if(index == 0){
            return array[index] > array[index+1];
        }else if(index == array.length -1){
            return array[index] < array[index -1];
        }else {
            return array[index -1] > array[index] || array[index] > array[index+1];
        }
    }
}

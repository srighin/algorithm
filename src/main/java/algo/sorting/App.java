package algo.sorting;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        int [] unsortedArray = {2, 7, 4, 1, 5, 3};
        //Sort sort = new SelectionSort();
        //Sort sort = new BubbleSort();
        //Sort sort = new InsertionSort();
        //Sort sort = new MergeSort();
        Sort sort = new QuickSort();
        int[] sortedArray = sort.sort(unsortedArray);
        Arrays.stream(sortedArray)
                .forEach(System.out:: println);
    }
}

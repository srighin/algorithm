package algo.sorting;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        int [] unsortedArray = {2, 7, 4, 1, 5, 3};
        //SelectionSort sort = new SelectionSort();
        BubbleSort sort = new BubbleSort();
        int[] sortedArray = sort.sort(unsortedArray);
        Arrays.stream(sortedArray)
                .forEach(System.out:: println);
    }
}

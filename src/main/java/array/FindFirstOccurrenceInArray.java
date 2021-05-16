package array;

public class FindFirstOccurrenceInArray {
    public static void main(String[] args) {
        int [] array = {7, 6, 7, 6, 7, 6, 5, 4, 5, 4, 3, 2, 1, 2, 3};
        int element = 2;
        int index = findFirstOccurrence(array, element);
        System.out.println(index);
    }

    private static int findFirstOccurrence(int[] array, int element) {

        int index = 0;

        while (index < array.length){
            if(element == array[index]){
                return index;
            }
            int diff = Math.abs(array[index] - element);
            index = index+diff;
        }
        return -1;
    }
}

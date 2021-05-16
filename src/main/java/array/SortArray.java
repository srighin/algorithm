package array;


public class SortArray {
    public static void main(String[] args) {
        int [] array = {-4, -2, 1, 3, 5};
        for (int num: array){
            System.out.print(num+" -> ");
        }

        System.out.println("------------------------------------------------------------");

        int [] result = sortArray(array);
        for (int num: result){
            System.out.print(num+" -> ");
        }
    }

    private static int [] sortArray(int[] array) {
        int startIndex = 0;
        int endIndex = array.length-1;
        int [] result = new int[array.length];

        int index = array.length-1;

        while (startIndex <= endIndex){
            if(array[startIndex]*array[startIndex] > array[endIndex]*array[endIndex]){
                result[index--] = array[startIndex]*array[startIndex];
                startIndex++;
            }else {
                result[index--] = array[endIndex]*array[endIndex];
                endIndex--;
            }
        }
        return result;
    }
}

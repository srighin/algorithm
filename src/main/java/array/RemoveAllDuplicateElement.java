package array;

public class RemoveAllDuplicateElement {
    public static void main(String[] args) {
        int [] array = {4, 4, 4, 4, 5, 6, 7, 7, 8};
        removeAllDuplicate(array);
        for (int num: array){
            System.out.print(num+" ->");
        }
    }

    private static void removeAllDuplicate(int[] array) {
        int startIndex = 1;

        for (int i=1; i< array.length; i++){
            if(array[i] != array[i-1]){
                array[startIndex++] = array[i];
            }
        }
    }
}

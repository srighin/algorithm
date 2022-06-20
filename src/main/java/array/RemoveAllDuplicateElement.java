package array;

public class RemoveAllDuplicateElement {
    public static void main(String[] args) {
        int [] array = {4, 4, 4, 4, 5, 6, 7, 7, 8};
        removeAllDuplicate(array);
    }

    private static void removeAllDuplicate(int[] array) {
        int startIndex = 1;

        for (int i=0; i< array.length-1; i++){
            if(array[i] != array[i+1]){
                array[startIndex++] = array[i+1];
            }
        }

        for(int i=0; i < startIndex; i++) {
            System.out.print("-> "+array[i]);
        }
    }
}

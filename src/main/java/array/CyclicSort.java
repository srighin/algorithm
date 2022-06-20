package array;

public class CyclicSort {
    public static void main(String[] args) {
        int [] array = {5, 2, 3, 3, 1, 5};
        sortCyclic(array);
        for (int num: array){
            System.out.print(num+" ->");
        }
    }

    private static void sortCyclic(int[] array) {
        if(array == null || array.length==0){
            return;
        }

        for(int index=0; index< array.length; index++){
            if(index != array[index]-1){
                int otherIndex = array[index]-1;

                int temp = array[index];
                array[index] = array[otherIndex];
                array[otherIndex] = temp;
            }
        }
    }
}

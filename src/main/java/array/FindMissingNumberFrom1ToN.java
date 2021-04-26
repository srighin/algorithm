package array;

public class FindMissingNumberFrom1ToN {
    public static void main(String[] args) {
        int [] array = {5, 2, 1, 4};
        sortArray(array);

        for(int index = 0;index<array.length; index++){
            if(array[index]-1 != index){
                System.out.println("Missing number:: "+(index+1));
            }
        }

    }

    private static void sortArray(int[] array) {
        if(array == null){
            return;
        }

        int startIndex = 0;
        while (startIndex < array.length){
            if(array[startIndex] < array.length && array[startIndex] - 1 != startIndex){
                int otherIndex = array[startIndex]-1;

                int temp = array[startIndex];
                array[startIndex] = array[otherIndex];
                array[otherIndex] = temp;
            }else {
                startIndex++;
            }
        }
    }
}

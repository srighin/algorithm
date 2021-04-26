package array;


public class FindFirstMissingPositiveNumber {
    public static void main(String[] args) {
        int[] array = {-2, 11, 1, -3, 2, 10, 4};
        int firstMissingNumber = getFirstMissingPositiveNumber(array);
        System.out.println(firstMissingNumber);
    }

    private static int getFirstMissingPositiveNumber(int[] array) {
        if (array == null) {
            return -1;
        }

        int index = 0;
        while (index < array.length) {
            if(array[index] > 0 && array[index]< array.length+1 && array[index] != array[array[index] -1]){
                int otherIndex= array[index] - 1;

                int temp = array[index];
                array[index] = array[otherIndex];
                array[otherIndex] = temp;

            }else {
                index++;
            }
        }

        for(int i = 0; i< array.length; i++){
            if(array[i] != i+1){
                return i+1;
            }
        }
        return -1;
    }


}

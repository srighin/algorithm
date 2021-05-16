package array;

public class Segregate0And1S {
    public static void main(String[] args) {
        int [] array = {1, 0, 1, 0, 1, 1, 0, 0};
        segreateAll0sAnd1s(array);
        for (int num: array){
            System.out.print(num+" -> ");
        }
    }

    private static void segreateAll0sAnd1s(int[] array) {
        int startIndex = 0;
        int endIndex = array.length-1;

        while (startIndex <= endIndex){
            while(startIndex<= endIndex && array[startIndex] == 0){
                startIndex++;
            }

            while (startIndex<= endIndex && array[endIndex] == 1){
                endIndex--;
            }

            if(startIndex <= endIndex){
                int temp = array[startIndex];
                array[startIndex] = array[endIndex];
                array[endIndex] = temp;
                startIndex++;
                endIndex--;
            }
        }
    }
}

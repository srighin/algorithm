package array;

public class FindMissingNumber {

    public static void main(String[] args) {
        int [] numbers = {3, 2, 4, 6, 1};
        int missingNumber = findMissingNumber(numbers);
        System.out.println(missingNumber);
    }

    private static int findMissingNumber(int[] numbers) {
        if(numbers.length == 0){
            return -1;
        }

        int index = 0;
        while (index < numbers.length){
            if(numbers[index] != index+1 && numbers[index] <= numbers.length){
                int otherIndex = numbers[index] -1;
                int temp = numbers[index];
                numbers[index]= numbers[otherIndex];
                numbers[otherIndex] = temp;
            }else {
                index++;
            }
        }

        for(int i = 0; i< numbers.length; i++){
            if (numbers[i] != i+1){
                return i+1;
            }
        }
        return -1;
    }
}

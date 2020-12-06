package leet;

public class MissingNumber {

    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 4, 5};
        int missingNumber =  missingNumber(numbers);
        System.out.println(missingNumber);
    }

    private static int missingNumber(int[] numbers) {
        int sum = 0;
        for(int num : numbers){
            sum += num;
        }

        return ((numbers.length +1)*numbers.length)/2 - sum;
    }
}

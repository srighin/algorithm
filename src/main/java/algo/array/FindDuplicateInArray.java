package algo.array;

public class FindDuplicateInArray {

    public static void main(String[] args) {
        int [] numbers = {2, 3, 1, 2, 4, 3};

        for (int index = 0; index < numbers.length; index++){
            if(numbers[Math.abs(numbers[index])] > 0){
                numbers[Math.abs(numbers[index])] = - numbers[Math.abs(numbers[index])];
            }else {
                System.out.println(Math.abs(numbers[index]));
            }
        }
    }
}

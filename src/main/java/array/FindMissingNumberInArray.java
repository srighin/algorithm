package array;

public class FindMissingNumberInArray {

    public static void main(String[] args) {
        int [] numbers = {2, 4, 1, 3, 6, 7, 8};
        int sum = 0;
        for(int num: numbers){
            sum+= num;
        }

        int n = numbers.length+1;

        int totalSum = n*(n+1)/2;

        System.out.println(totalSum - sum);
    }
}

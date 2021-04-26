package array;

public class FindTheLargestContigousSum {
    public static void main(String[] args) {
        int [] numbers = {-3, -4, 4, -1, -2, 1, 5, -3};
        int maxSumTillNow = Integer.MIN_VALUE;
        int localSum = numbers[0];

        for(int i=1; i< numbers.length; i++){
            localSum = Math.max(numbers[i], numbers[i]+localSum);
            maxSumTillNow = Math.max(maxSumTillNow, localSum);
        }

        System.out.println(maxSumTillNow);
    }
}

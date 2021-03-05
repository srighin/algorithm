package dp;

public class EqualSumPartition {
    public static void main(String[] args) {
        int [] numbers = {2, 2, 5, 9};
        int sum = 0;
        SubSetSumProblem subSetSumProblem = new SubSetSumProblem();

        for (int num :
                numbers) {
            sum += num;
        }

        if(sum % 2 != 0){
            System.out.println("false");
        }else {
            subSetSumProblem.main(numbers, sum/2);
        }
    }
}

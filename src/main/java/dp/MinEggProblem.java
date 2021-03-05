package dp;

public class MinEggProblem {

    public static void main(String[] args) {
        int numberOfEgg = 10;
        int numberOfFloor = 10;

        MinEggProblem problem = new MinEggProblem();
        int attempt = problem.findMinAttempt(numberOfEgg,  numberOfFloor);
        System.out.println(attempt);
    }

    private int findMinAttempt(int numberOfEgg, int numberOfFloor) {

        if(numberOfFloor == 0 || numberOfFloor ==1){
            return numberOfFloor;
        }

        if(numberOfEgg == 1){
            return numberOfFloor;
        }

        int minAttempt = Integer.MAX_VALUE;

        for (int i = 1; i< numberOfFloor; i++){
            int result = Math.max(findMinAttempt(numberOfEgg -1, numberOfFloor-1),
                    findMinAttempt(numberOfEgg, numberOfFloor-i));
            if (result < minAttempt){
                minAttempt = result;
            }
        }
        return minAttempt;
    }
}

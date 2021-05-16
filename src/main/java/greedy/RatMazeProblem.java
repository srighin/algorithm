package greedy;

public class RatMazeProblem {
    public static void main(String[] args) {
        int [][] array = {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {0, 1, 0, 0},
                {1, 1, 1, 1}
        };
        printSolution(array);
        printPath(array);
    }

    private static void printPath(int[][] array) {
        if(array== null || array.length == 0){
            return;
        }

        int [][] sol = new int[array.length][array[0].length];

        if(ratMaze(array, sol, 0, 0)){
            System.out.println("true");
            return;
        }
        System.out.println("false");
        return;
    }
    private static boolean ratMaze(int[][] array, int[][] sol, int x, int y) {

        return false;

    }

    private static void  printSolution(int sol[][])
    {
        for (int i = 0; i < sol.length; i++) {
            for (int j = 0; j < sol[0].length; j++)
                System.out.print(
                        " " + sol[i][j] + " ");
            System.out.println();
        }
    }


}

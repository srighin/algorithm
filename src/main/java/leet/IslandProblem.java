package leet;

public class IslandProblem {

    public static void main(String[] args) {
        char [][] groupOfIsland = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '1', '0'}
        } ;

        int noOfIsland = numOfIsland(groupOfIsland);
        System.out.println(noOfIsland);
    }

    private static int numOfIsland(char[][] group) {
        int noOfIsland = 0;
        if (group == null || group.length == 0 ){
            return noOfIsland;
        }

        for(int i = 0; i< group.length; i++){
            for (int j=0; j< group[i].length; j++){
                if (group[i][j] == '1'){
                    noOfIsland += dfs(group, i, j);
                }
            }
        }
        return  noOfIsland;
    }

    private static int dfs(char[][] grid, int i, int j) {
        if(i< 0 || i>= grid.length || j< 0 || j>= grid[i].length || grid[i][j] != '1'){
            return 0;
        }
        grid[i][j] = '2';
        dfs(grid, i+1, j);
        dfs(grid, i-1, j);
        dfs(grid, i, j+1);
        dfs(grid, i, j-1);
        return  1;

    }
}

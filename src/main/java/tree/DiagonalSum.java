package tree;


import java.util.List;

public class DiagonalSum {
    public static void main(String[] args) {
        TreeNode root = TreeUtil.create();
        List<Integer> diagonalSum = calculateDiagonalSum(root);
        diagonalSum.stream().forEach(num-> System.out.println(num + "  "));
    }

    private static List<Integer> calculateDiagonalSum(TreeNode root) {
        return null;
    }
}

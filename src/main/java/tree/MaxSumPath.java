package tree;

import static java.lang.Math.max;

public class MaxSumPath {

    private static int maxValue = 0;

    public static void main(String[] args) {
        findMaxSum(TreeUtil.create());
        System.out.println(maxValue);
    }

    private static int findMaxSum(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if (root.getLeft() == null && root.getRight() == null) {
            return root.getData();
        }

        int left = findMaxSum(root.getLeft());
        int right = findMaxSum(root.getRight());

        int maxOne = max(root.getData(), max(left, right) + root.getData());
        int maxTwo = max(maxOne, root.getData() + left + right);

        maxValue = max(maxTwo, maxValue);
        return maxOne;
    }
}

package tree;

import static java.lang.Math.max;

public class FindMaxSumPath {
    private static int maxSum;
    public static void main(String[] args) {
        getMaxSumPath(TreeUtil.create());
        System.out.println(maxSum);
    }

    private static int getMaxSumPath(TreeNode treeNode) {
        if(treeNode ==  null){
            return 0;
        }

        if(treeNode.getLeft() == null && treeNode.getRight() ==  null){
            return treeNode.getData();
        }

        int left = getMaxSumPath(treeNode.getLeft());
        int right = getMaxSumPath(treeNode.getRight());

        int maxOne = max(treeNode.getData(), treeNode.getData()+max(left, right));
        int maxTwo = max(maxOne, treeNode.getData()+left+right);
        maxSum = max(maxTwo, maxSum);
        return maxOne;
    }
}

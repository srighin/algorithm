package tree;

import static java.lang.Math.max;

public class HeightOfBinaryTree {

    public static void main(String[] args) {
        TreeNode treeNode = TreeUtil.create();
        int height = getHeight(treeNode);
        System.out.println(height);
    }

    private static int getHeight(TreeNode treeNode) {
        if (treeNode == null) {
            return 0;
        }
        if (treeNode.getLeft() == null && treeNode.getRight() == null) {
            return 1;
        }

        return 1 + max(getHeight(treeNode.getLeft()), getHeight(treeNode.getRight()));
    }
}

package tree;

public class FindTheSumOfLeftNode {
    public static void main(String[] args) {
        TreeNode treeNode = TreeUtil.create();
        int sumOfLeftLeafNode = getSumOfLeftLeafNode(treeNode, false, 0);
        System.out.println(sumOfLeftLeafNode);
    }

    private static int getSumOfLeftLeafNode(TreeNode treeNode, boolean isLeftNode, int sum) {
        if (treeNode == null) {
            return 0;
        }

        if (treeNode.getLeft() == null && treeNode.getRight() == null && isLeftNode) {
            return sum + treeNode.getData();
        }

        return getSumOfLeftLeafNode(treeNode.getLeft(), true, sum + treeNode.getData()) +
                getSumOfLeftLeafNode(treeNode.getRight(), false, sum + treeNode.getData());
    }
}

package tree;

public class GetAverageOfAllNodeInTree {

    private static int sum;
    private static int numberOfNode;

    public static void main(String[] args) {
        getAverageOfAllNodeInBinaryTree(TreeUtil.create());
        int average = sum / numberOfNode;
        System.out.println(average);
    }

    private static void getAverageOfAllNodeInBinaryTree(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        sum = sum + treeNode.getData();
        numberOfNode += 1;
        getAverageOfAllNodeInBinaryTree(treeNode.getLeft());
        getAverageOfAllNodeInBinaryTree(treeNode.getRight());
    }
}

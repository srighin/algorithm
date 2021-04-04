package tree;

public class GetTheSumOfAllNodeInTree {
    public static void main(String[] args) {
        TreeNode treeNode = TreeUtil.create();
        int sum = getSumOfAllNode(treeNode);
        System.out.println(sum);
    }

    private static int getSumOfAllNode(TreeNode treeNode) {
        if(treeNode == null){
            return 0;
        }
        return treeNode.getData()+getSumOfAllNode(treeNode.getLeft())+getSumOfAllNode(treeNode.getRight());
    }
}

package tree;

public class GetNoOfLeafNode {
    public static void main(String[] args) {
        TreeNode treeNode = TreeUtil.create();
        int noOfNode = getNoOfLeafNode(treeNode);
        System.out.println(noOfNode);
    }

    private static int getNoOfLeafNode(TreeNode treeNode) {
        if(treeNode == null){
            return 0;
        }
        if(treeNode.getLeft() == null && treeNode.getRight() == null){
            return 1;
        }
        return getNoOfLeafNode(treeNode.getLeft())+getNoOfLeafNode(treeNode.getRight());
    }
}

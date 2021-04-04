package tree;

public class GetNumberOfNode {

    public static void main(String[] args) {
        TreeNode treeNode = TreeUtil.create();

        int noOfNode = getNumberOfNodeInTree(treeNode);
        System.out.println(noOfNode);
    }

    private static int getNumberOfNodeInTree(TreeNode treeNode) {
        if(treeNode ==  null){
            return 0;
        }

        return 1+getNumberOfNodeInTree(treeNode.getLeft()) + getNumberOfNodeInTree(treeNode.getRight());
    }
}
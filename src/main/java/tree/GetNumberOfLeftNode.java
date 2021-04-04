package tree;

public class GetNumberOfLeftNode {

    public static void main(String[] args) {
        TreeNode treeNode = TreeUtil.create();
        int noOfLeftNode = getNumberOfLeftNode(treeNode);
        System.out.println(noOfLeftNode);
    }

    private static int getNumberOfLeftNode(TreeNode treeNode) {
        if(treeNode == null){
            return 0;
        }

        if(treeNode.getLeft() != null){

        }
        return 0;
    }
}

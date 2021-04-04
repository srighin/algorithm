package tree;

public class CheckIfTwoNodeIsSibling {
    public static void main(String[] args) {
        boolean isSibling = checkIfTwoNodeAreSibling(TreeUtil.create(), 6, 10);
        System.out.println(isSibling);
    }

    private static boolean checkIfTwoNodeAreSibling(TreeNode treeNode, int node1, int node2) {
        if(treeNode == null){
            return false;
        }
        if((treeNode.getLeft() != null && (treeNode.getLeft().getData() == node1 || treeNode.getLeft().getData() == node2))
                && (treeNode.getRight() != null && (treeNode.getRight().getData() == node1 || treeNode.getRight().getData() == node2))){
            return true;
        }

        return checkIfTwoNodeAreSibling(treeNode.getLeft(), node1, node2) || checkIfTwoNodeAreSibling(treeNode.getRight(), node1, node2);
    }
}

package tree;

public class FindTheParentOfNode {
    public static void main(String[] args) {
        printParent(TreeUtil.create(), 15);
    }

    private static boolean printParent(TreeNode treeNode, int node) {
        if(treeNode == null){
            return false;
        }

        if((treeNode.getLeft() != null && treeNode.getLeft().getData() == node) || (treeNode.getRight()!= null &&treeNode.getRight().getData() == node)){
            System.out.println(treeNode.getData());
            return false;
        }

        return printParent(treeNode.getLeft(), node) || printParent(treeNode.getRight(), node);
    }
}

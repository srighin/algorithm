package tree;

public class PrintSiblingOfTree {
    public static void main(String[] args) {
        printSibling(TreeUtil.create(), 12);
    }

    private static boolean printSibling(TreeNode treeNode, int node) {
        if(treeNode == null){
            return false;
        }

        if((treeNode.getLeft() != null && treeNode.getLeft().getData() == node) ||
            (treeNode.getRight() != null && treeNode.getRight().getData() == node)){
            if(treeNode.getLeft().getData() == node){
                System.out.println(treeNode.getRight().getData());
            }else {
                System.out.println(treeNode.getLeft().getData());
            }
            return false;
        }

        return printSibling(treeNode.getLeft(), node) || printSibling(treeNode.getRight(), node);
    }
}

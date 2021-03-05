package tree;

public class BinaryTreeIsBST {
    public static void main(String[] args) {
        TreeNode root = TreeUtil.create();
        boolean flag = isBST(root);
        System.out.println(flag);
    }

    private static boolean isBST(TreeNode root) {
        if(root == null){
            return true;
        }

        if(root.getLeft()!= null && root.getLeft().getData() > root.getData()){
            return false;
        }
        if(root.getRight() != null && root.getRight().getData() < root.getData()){
            return false;
        }
        return isBST(root.getLeft()) && isBST(root.getRight());
    }
}

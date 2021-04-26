package tree;

public class CheckBST {
    public static void main(String[] args) {
        boolean isBST = checkIfBST(TreeUtil.create());
        System.out.println(isBST);
    }

    private static boolean checkIfBST(TreeNode root) {
        if(root == null){
            return true;
        }

        if((root.getLeft() != null && root.getData() < root.getLeft().getData()) ||
                (root.getRight() != null && root.getData() > root.getRight().getData())){
            return false;
        }
        return checkIfBST(root.getLeft()) && checkIfBST(root.getRight());
    }
}

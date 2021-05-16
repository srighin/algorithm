package tree;

public class CheckBSTProperty {
    private static TreeNode prev;
    public static void main(String[] args) {
        TreeNode root = TreeUtil.create();
        boolean isBST = validateBst(root);
        System.out.println(isBST);
    }

    private static boolean validateBst(TreeNode tree) {
        if(tree == null){
            return true;
        }
        validateBst(tree.getLeft());

        if(prev != null && prev.getData() > tree.getData()){
            return false;
        }

        prev = tree;
        return validateBst(tree.getRight());
    }
}

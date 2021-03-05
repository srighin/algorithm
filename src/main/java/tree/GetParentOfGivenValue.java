package tree;

public class GetParentOfGivenValue {

    public static void main(String[] args) {
        TreeNode root = TreeUtil.create();
        TreeNode parent = getParent(root, 10);
        System.out.println(parent.getData());
    }

    private static TreeNode getParent(TreeNode root, int value) {
        if(root == null || root.getData() == value) {
            return null;
        }

        if(root.getLeft().getData() == value || root.getRight().getData() == value){
            return root;
        }

        TreeNode left = getParent(root.getLeft(), value);
        if(left != null){
            return left;
        }

        return getParent(root.getRight(), value);

    }
}

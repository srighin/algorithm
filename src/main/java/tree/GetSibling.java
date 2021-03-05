package tree;

public class GetSibling {

    public static void main(String[] args) {
        TreeNode sibling = getSibling(TreeUtil.create(), 18);
        System.out.println(sibling.getData());
    }

    private static TreeNode getSibling(TreeNode root, int value) {
        if (root == null || root.getData() == value || root.getLeft() == null || root.getRight() == null) {
            return null;
        }

        if (root.getLeft().getData() == value) {
            return root.getRight();
        }
        if (root.getRight().getData() == value) {
            return root.getLeft();
        }

        TreeNode left = getSibling(root.getLeft(), value);
        if (left != null) {
            return left;
        }
        return getSibling(root.getRight(), value);
    }
}

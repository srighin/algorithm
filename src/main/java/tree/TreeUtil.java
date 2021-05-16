package tree;

public class TreeUtil {

    public static TreeNode create(){
        TreeNode root = new TreeNode(10);
        TreeNode left = new TreeNode(6);
        TreeNode right = new TreeNode(15);

        root.setLeft(left);
        root.setRight(right);

        TreeNode leftLeft = new TreeNode(4);
        TreeNode leftRight = new TreeNode(8);
        left.setLeft(leftLeft);
        left.setRight(leftRight);

        TreeNode rightLeft = new TreeNode(12);
        TreeNode rightRight = new TreeNode(18);

        right.setLeft(rightLeft);
        right.setRight(rightRight);

        return root;
    }

    public static TreeNode create2() {

        TreeNode root = new TreeNode(10);
        TreeNode left = new TreeNode(6);
        TreeNode right = new TreeNode(18);

        root.setLeft(left);
        root.setRight(right);

        return root;
    }

    public static TreeNode create3(){
        TreeNode root = new TreeNode(2);
        TreeNode left = new TreeNode(7);
        TreeNode right = new TreeNode(5);

        root.setLeft(left);
        root.setRight(right);

        TreeNode leftLeft = new TreeNode(12);
        TreeNode leftRight = new TreeNode(6);
        left.setLeft(leftLeft);
        left.setRight(leftRight);

        TreeNode leftLeftLeft = new TreeNode(1);
        leftLeft.setLeft(leftLeftLeft);

        TreeNode leftLeftLeftLeft = new TreeNode(10);
        leftLeftLeft.setLeft(leftLeftLeftLeft);

        return root;
    }
}

package tree;


import java.util.HashSet;
import java.util.Set;

public class ReverseLevelOrder {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        TreeNode left = new TreeNode(6);
        TreeNode right = new TreeNode(15);

        root.setLeft(left);
        root.setRight(right);

        TreeNode leftLeft = new TreeNode(15);
        TreeNode leftRight = new TreeNode(15);
        left.setLeft(leftLeft);
        left.setRight(leftRight);

        //reverseLevelOrder(root, 0);
    }




}

class TreeNode{
    private int data;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(int data) {
        this.data = data;
    }

    public static TreeNode create() {

        TreeNode root = new TreeNode(10);
        TreeNode left = new TreeNode(6);
        TreeNode right = new TreeNode(15);

        root.setLeft(left);
        root.setRight(right);

        TreeNode leftLeft = new TreeNode(3);
        TreeNode leftRight = new TreeNode(8);
        left.setLeft(leftLeft);
        left.setRight(leftRight);

        return root;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "data=" + data +
                '}';
    }
}

package tree;


import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
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
    private int height;
    public TreeNode next;
    public TreeNode prev;



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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public static void levelOrderTraversal(TreeNode root) {
        if(root == null){
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (true){
            int size = queue.size();

            if(size == 0){
                break;
            }

            while(size > 0){
                TreeNode currentNode = queue.poll();
                System.out.print(currentNode.getData()+" ->");
                if(currentNode.getLeft() != null){
                    queue.add(currentNode.getLeft());
                }

                if(currentNode.getRight() != null){
                    queue.add(currentNode.getRight());
                }
                size--;
            }
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "data=" + data +
                '}';
    }
}

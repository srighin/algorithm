package tree;

import java.util.LinkedList;
import java.util.Queue;

public class RightViewOfBinaryTree {

    public static void main(String[] args) {
        printRightViewOfBinaryTree(TreeUtil.create());
    }
    private static void printRightViewOfBinaryTree(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(treeNode);
        boolean flag = true;

        while (!queue.isEmpty()) {

            int size = queue.size();
            if (size == 0) {
                break;
            }
            while (size > 0) {
                TreeNode currentNode = queue.poll();

                if (flag && size == 1) {
                    System.out.println(currentNode.getData());
                    flag = false;
                }
                if (currentNode.getLeft() != null) {
                    queue.add(currentNode.getLeft());
                }
                if (currentNode.getRight() != null) {
                    queue.add(currentNode.getRight());
                }
                size--;
            }
            flag = true;

        }
    }
}

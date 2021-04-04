package tree;

import java.util.LinkedList;
import java.util.Queue;

import static java.lang.Math.max;

public class PrintElementAtGivenLevel {

    public static void main(String[] args) {
        printNodeAtGivenLevel(TreeUtil.create(), 1);
        System.out.println();
        System.out.println("----USING RECURSION----");
        printNodeAtGivenLevelUsingRecursion(TreeUtil.create(), 1);
    }

    private static void printNodeAtGivenLevelUsingRecursion(TreeNode treeNode, int level) {
        if(treeNode == null){
            return;
        }
        if(level == 1){
            System.out.print(treeNode.getData()+" -> ");
            return;
        }
        printNodeAtGivenLevelUsingRecursion(treeNode.getLeft(), level-1);
        printNodeAtGivenLevelUsingRecursion(treeNode.getRight(), level-1);
    }

    private static void printNodeAtGivenLevel(TreeNode treeNode, int level) {
        int height = getHeight(treeNode);
        if (treeNode == null || level > height) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(treeNode);
        int currentLevel = 1;
        while (!queue.isEmpty()) {

            int sizeOfQueue = queue.size();
            if (sizeOfQueue == 0) {
                break;
            }
            while (sizeOfQueue > 0) {
                TreeNode currentNode = queue.poll();

                if (currentLevel == level) {
                    System.out.print(currentNode.getData()+ " -> ");
                }

                if (currentNode.getLeft() != null) {
                    queue.add(currentNode.getLeft());
                }
                if (currentNode.getRight() != null) {
                    queue.add(currentNode.getRight());
                }
                sizeOfQueue--;
            }
            currentLevel++;
        }
    }

    private static int getHeight(TreeNode treeNode) {
        if (treeNode == null) {
            return 0;
        }

        return 1 + max(getHeight(treeNode.getLeft()), getHeight(treeNode.getRight()));
    }
}

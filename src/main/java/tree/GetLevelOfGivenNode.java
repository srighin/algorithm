package tree;

import java.util.LinkedList;
import java.util.Queue;

public class GetLevelOfGivenNode {
    public static void main(String[] args) {
        int level = getLevel(TreeUtil.create(), new TreeNode(10));
        System.out.println(level);
    }

    private static int getLevel(TreeNode treeNode, TreeNode givenNode) {
        int level = -1;
        if (treeNode == null || givenNode == null) {
            return level;
        }

        level = 1;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(treeNode);

        while (!queue.isEmpty()) {

            int size = queue.size();
            if (size == 0) {
                break;
            }

            while (size > 0) {
                TreeNode currentNode = queue.poll();
                if (currentNode.getData() == givenNode.getData()) {
                    return level;
                }

                if (currentNode.getLeft() != null) {
                    queue.add(currentNode.getLeft());
                }

                if (currentNode.getRight() != null) {
                    queue.add(currentNode.getRight());
                }
                --size;
            }
            level++;
        }

        return level;
    }
}

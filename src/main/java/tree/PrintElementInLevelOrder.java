package tree;

import java.util.LinkedList;
import java.util.Queue;

public class PrintElementInLevelOrder {
    public static void main(String[] args) {
        printElementInLevelOrder(TreeUtil.create());
    }

    private static void printElementInLevelOrder(TreeNode treeNode) {
        if(treeNode == null){
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(treeNode);
        while (!queue.isEmpty()){
            int size = queue.size();

            if(size == 0){
                break;
            }

            while(size > 0){
                TreeNode currentNode = queue.poll();
                System.out.print(currentNode.getData()+" -> ");
                if(currentNode.getLeft() != null){
                    queue.add(currentNode.getLeft());
                }
                if(currentNode.getRight() != null){
                    queue.add(currentNode.getRight());
                }
                size --;
            }
            System.out.println();
        }
    }
}

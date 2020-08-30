package leet;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryMirrorImageProblem {

    static class BinaryTree {
        public int value;
        public BinaryTree left;
        public BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
        }
    }

    public static void invertBinaryTree(BinaryTree tree) {
        Queue<BinaryTree> queue = new LinkedList<>();
        queue.add(tree);

        while(!queue.isEmpty()){
            BinaryTree currentNode = queue.poll();
            BinaryTree tempNode = currentNode.left;
            currentNode.left = currentNode.right;
            currentNode.right = tempNode;
            if(currentNode.left != null ){
                queue.add(currentNode.left);
            }
            if (currentNode.right != null){
                queue.add(currentNode.right);
            }
        }

    }
}

package tree.max;

import tree.Node;

import java.util.LinkedList;
import java.util.Queue;

public class FindMaxWithoutRecursion {

    public int getMax(Node root){
        int max = Integer.MIN_VALUE;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            Node currentNode = q.remove();
            if(max < currentNode.getData()){
                max = currentNode.getData();
            }

            if(currentNode != null){
                if(currentNode.getLeftNode() != null){
                    q.add(currentNode.getLeftNode());
                }
                if(currentNode.getRightNode() != null){
                    q.add(currentNode.getRightNode());
                }
            }
        }

        return max;
    }
}

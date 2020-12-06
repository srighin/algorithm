package tree;

import java.util.LinkedList;
import java.util.Queue;

public class CountHalfNode {
    public static void main(String[] args) {
        Node root = new Node(4);
        Node node1 = new Node(3);
        Node node2 = new Node(5);
        Node node3 = new Node(6);

        root.setLeftNode(node1);
        root.setRightNode(node2);
        node2.setLeftNode(node3);

        int count = countRootNode(root);
        System.out.println(count);
    }

    private static int countRootNode(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int count = 0;

        while( !q.isEmpty()){
            Node node = q.remove();

            if((node.getLeftNode() == null && node.getRightNode() != null) ||
            (node.getLeftNode() != null && node.getRightNode() == null)){
                count++;
            }

            if(node.getLeftNode() != null){
                q.add(node.getLeftNode());
            }
            if(node.getRightNode() != null){
                q.add(node.getRightNode());
            }
        }
        return count;
    }
}

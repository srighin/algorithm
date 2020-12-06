package tree.insert;

import tree.Node;

import java.util.LinkedList;
import java.util.Queue;

public class InsertNodeUsingLevelOrder {

    public Node insert(Node root, int data){

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()){
            Node current = q.remove();

            if(current.getLeftNode() != null){
                q.add(current.getLeftNode());
            }else{
                current.setLeftNode(new Node(data));
                return root;
            }

            if(current.getRightNode() != null){
                q.add(current.getRightNode());
            }else {
                current.setRightNode(new Node(data));
                return root;
            }
        }
        return root;
    }
}

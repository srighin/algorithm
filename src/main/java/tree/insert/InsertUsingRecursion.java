package tree.insert;

import tree.Node;

public class InsertUsingRecursion {

    public Node insert(Node root, int data){

        if(root != null){
            if(root.getLeftNode() != null){
                insert(root.getLeftNode(), data);
            }else if(root.getLeftNode() == null) {
                root.setLeftNode(new Node(data));
                return root;
            } else if(root.getRightNode() != null){
                insert(root.getRightNode(), data);
            }else if(root.getRightNode() == null){
                root.setRightNode(new Node(data));
                return root;
            }
        }
        return root;
    }
}

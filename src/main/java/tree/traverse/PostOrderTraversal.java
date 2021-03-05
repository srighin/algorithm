package tree.traverse;

import tree.Node;

public class PostOrderTraversal {

    public void postOrderTraversal(Node root){
        if(root == null){
            return;
        }
        postOrderTraversal(root.getLeftNode());
        postOrderTraversal(root.getRightNode());
        System.out.print(root.getData() + ", ");
    }
}

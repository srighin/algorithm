package tree.traverse;

import tree.Node;

public class InOrderTraversal {
    public void inOrderTraversal(Node root) {
        if(root != null){
            inOrderTraversal(root.getLeftNode());
            System.out.print(root.getData()+ ", ");
            inOrderTraversal(root.getRightNode());
        }
    }
}

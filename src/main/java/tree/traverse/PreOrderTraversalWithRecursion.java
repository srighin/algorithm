package tree.traverse;

import tree.Node;
import java.util.Stack;

public class PreOrderTraversalWithRecursion {

    public void preOrderTraversal(Node root){
        if(root == null){
            System.out.println("No element found");
            throw new RuntimeException("No Element found");
        }

        Stack<Node> stack = new Stack<>();
        stack.push(root);
        System.out.println();
        while(!stack.isEmpty()){
            Node currentNode = stack.pop();
            System.out.print(currentNode.getData() +", ");

            if(currentNode.getRightNode() != null){
                stack.push(currentNode.getRightNode());
            }
            if(currentNode.getLeftNode()!= null) {
                stack.push(currentNode.getLeftNode());
            }
        }
    }
}

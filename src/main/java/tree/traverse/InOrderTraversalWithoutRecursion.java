package tree.traverse;

import tree.Node;

import java.util.Stack;

public class InOrderTraversalWithoutRecursion {

    public void inOrderTraversal(Node root){

        if(root  == null){
            return;
        }

        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()){
            Node current = stack.pop();

            System.out.println(current.getData());
            if(root.getRightNode() != null){
                stack.push(current.getRightNode());
            }
            if(current.getLeftNode() != null){
                stack.push(current.getLeftNode());
            }
        }
    }
}

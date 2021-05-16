package tree.traverse;

import tree.Node;

import java.util.Stack;

public class InOrderTraversal {
    public void inOrderTraversal(Node root) {
        if(root != null){
            inOrderTraversal(root.getLeftNode());
            System.out.print(root.getData()+ ", ");
            inOrderTraversal(root.getRightNode());
        }
    }

    public void inOrderTraversalWithoutRecursion(Node root){
        if(root ==  null){
            return;
        }
        System.out.println("------ inOrderTraversalWithoutRecursion-------");

        Stack<Node> stack = new Stack<>();
        while (root != null){
            stack.add(root.getLeftNode());
            root = root.getLeftNode();
        }

        while (stack.size() > 0){
            Node currentNode = stack.pop();
            System.out.print(currentNode.getData()+" -> ");
            if(currentNode.getRightNode() != null){
                stack.add(currentNode.getRightNode());
                while (currentNode != null){
                    stack.add(currentNode.getLeftNode());
                    currentNode = currentNode.getLeftNode();
                }
            }
        }
    }
}

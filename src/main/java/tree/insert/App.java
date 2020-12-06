package tree.insert;

import tree.Node;
import tree.traverse.InOrderTraversal;

public class App {

    public static void main(String[] args) {
        Node root = new Node(10);
        Node leftRoot = new Node(5);
        Node rightRoot = new Node(15);
        Node leftLeftRoot = new Node(2);

        root.setLeftNode(leftRoot);
        root.setRightNode(rightRoot);

        leftRoot.setLeftNode(leftLeftRoot);
        InOrderTraversal inOrderTraversal = new InOrderTraversal();
        inOrderTraversal.inOrderTraversal(root);
        //InsertNodeUsingLevelOrder nodeUsingLevelOrder = new InsertNodeUsingLevelOrder();
        InsertUsingRecursion nodeUsingLevelOrder = new InsertUsingRecursion();
        nodeUsingLevelOrder.insert(root, 11);
        System.out.println();
        inOrderTraversal.inOrderTraversal(root);

    }
}

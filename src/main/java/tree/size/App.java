package tree.size;

import tree.Node;
import tree.insert.InsertUsingRecursion;
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

        TreeSize treeSize = new TreeSize();
        System.out.println(treeSize.findSize(root));
    }
}

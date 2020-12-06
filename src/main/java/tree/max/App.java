package tree.max;

import tree.Node;
import tree.traverse.InOrderTraversalWithoutRecursion;

public class App {

    public static void main(String[] args) {
        Node root = new Node(10);
        Node leftRoot = new Node(5);
        Node rightRoot = new Node(15);
        Node leftLeftRoot = new Node(2);

        root.setLeftNode(leftRoot);
        root.setRightNode(rightRoot);

        leftRoot.setLeftNode(leftLeftRoot);

//        FindMaxInTree max = new FindMaxInTree();
        FindMaxWithoutRecursion max = new FindMaxWithoutRecursion();
        int maximum = max.getMax(root);
        System.out.println(maximum);

    }
}

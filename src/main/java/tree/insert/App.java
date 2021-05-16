package tree.insert;

import tree.FindDepthOfTree;
import tree.FindDiameterOfTree;
import tree.LowestCommonAncestor;
import tree.Node;
import tree.traverse.InOrderTraversal;
import tree.traverse.PostOrderTraversal;
import tree.traverse.PreOrderTraversalWithRecursion;

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
        System.out.println("In order traversal");
        inOrderTraversal.inOrderTraversal(root);

        inOrderTraversal.inOrderTraversalWithoutRecursion(root);
        System.out.println();
        System.out.print("Pre order traversal");

        PreOrderTraversalWithRecursion withRecursion = new PreOrderTraversalWithRecursion();
        withRecursion.preOrderTraversal(root);

        PostOrderTraversal postOrderTraversal = new PostOrderTraversal();
        System.out.println();
        System.out.print("Post order traversal");
        System.out.println();
        postOrderTraversal.postOrderTraversal(root);

        System.out.println();
        FindDepthOfTree depthOfTree = new FindDepthOfTree();
        System.out.println("Depth:: "+depthOfTree.getDepth(root));

        FindDiameterOfTree diameterOfTree = new FindDiameterOfTree();
        int treeDiameter = diameterOfTree.getTreeDiameter(root);
        System.out.println("Tree diameter:: "+treeDiameter);

        LowestCommonAncestor commonAncestor = new LowestCommonAncestor();
        Node lowestCommonAncestor = commonAncestor.findLowestCommonAncestor(root, rightRoot, leftRoot);
        System.out.println("lowest common ancestor :: "+lowestCommonAncestor.getData());
    }
}

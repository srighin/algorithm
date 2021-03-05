package tree;

public class FindDepthOfTree {

    public int getDepth(Node root) {
        if (root == null) {
            return 0;
        }
        return Math.max(getDepth(root.getLeftNode()), getDepth(root.getRightNode())) + 1;
    }
}

package tree;

public class FindDiameterOfTree {

    public int getTreeDiameter(Node root){
        if (root == null){
            return 0;
        }

        FindDepthOfTree depthOfTree = new FindDepthOfTree();

        int leftHeight = depthOfTree.getDepth(root.getLeftNode());
        int rightHeight = depthOfTree.getDepth(root.getRightNode());

        return leftHeight+rightHeight+1;
    }
}

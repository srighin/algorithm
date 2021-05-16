package tree;

public class FindDiameterOfTree {

    public static void main(String[] args) {
        TreeNode root = TreeUtil.create();
        int diameter = getTreeDiameter2(root);
        System.out.println(diameter);
    }

    private static int getTreeDiameter2(TreeNode root) {
        if(root ==  null){
            return 0;
        }

        int lh = getHeight(root);
        int rh = getHeight(root);

        int lD = getTreeDiameter2(root.getLeft());
        int rD = getTreeDiameter2(root.getRight());


        return Math.max(lh+rh+1, Math.max(lD, rD));
    }

    private static int getHeight(TreeNode root) {
        if(root == null){
            return 0;
        }

        return 1+ Math.max(getHeight(root.getLeft()), getHeight(root.getRight()));
    }

    public static int getTreeDiameter(Node root){
        if (root == null){
            return 0;
        }

        FindDepthOfTree depthOfTree = new FindDepthOfTree();

        int leftHeight = depthOfTree.getDepth(root.getLeftNode());
        int rightHeight = depthOfTree.getDepth(root.getRightNode());

        return leftHeight+rightHeight+1;
    }
}

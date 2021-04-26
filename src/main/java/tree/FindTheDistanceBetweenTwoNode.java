package tree;

public class FindTheDistanceBetweenTwoNode {
    public static void main(String[] args) {
        int distance = findDistanceBetweenTwoNode(TreeUtil.create(), 4, 15);
        System.out.println(distance);
    }

    private static int findDistanceBetweenTwoNode(TreeNode treeNode, int node1, int node2) {

        if(treeNode == null){
            return -1;
        }

        TreeNode lca = findLCA(treeNode, node1, node2);
        int lHeight = findHeight(lca, node1, 0);
        int rHeight = findHeight(lca, node2, 0);
        return lHeight+rHeight;
    }

    private static int findHeight(TreeNode treeNode, int node, int level) {
        if(treeNode == null){
            return 0;
        }
        if(treeNode.getData() == node){
            return level;
        }

        return findHeight(treeNode.getLeft(), node, level+1)
                + findHeight(treeNode.getRight(), node, level+1);
    }

    private static TreeNode findLCA(TreeNode treeNode, int node1, int node2) {
        if(treeNode == null){
            return null;
        }
        if(treeNode.getData() == node1 || treeNode.getData() == node2){
            return treeNode;
        }
        TreeNode lNode = findLCA(treeNode.getLeft(), node1, node2);
        TreeNode rNode = findLCA(treeNode.getRight(), node1, node2);

        if(lNode != null && rNode != null){
            return treeNode;
        }

        return lNode != null ? lNode : rNode;
    }
}

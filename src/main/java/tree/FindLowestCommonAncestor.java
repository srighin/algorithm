package tree;

public class FindLowestCommonAncestor {
    public static void main(String[] args) {
        TreeNode lca = findLowestCommonAncestor(TreeUtil.create(), 4, 18);
        System.out.println(lca.getData());
    }

    private static TreeNode findLowestCommonAncestor(TreeNode treeNode, int node1, int node2) {

        if(treeNode == null){
            return null;
        }

        if(treeNode.getData() == node1 || treeNode.getData() ==  node2){
            return treeNode;
        }
        TreeNode lNode = findLowestCommonAncestor(treeNode.getLeft(), node1, node2);
        TreeNode rNode = findLowestCommonAncestor(treeNode.getRight(), node1, node2);

        if(lNode != null && rNode != null){
            return treeNode;
        }
        return lNode != null ? lNode: rNode;
    }
}

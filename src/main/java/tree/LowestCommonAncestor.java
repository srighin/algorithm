package tree;

public class LowestCommonAncestor {

    public static void main(String[] args) {
        TreeNode node = findLowestCommonAncestor(TreeUtil.create(), 4, 18);
        System.out.println(node.getData());
    }

    private static TreeNode findLowestCommonAncestor(TreeNode root, int node1, int node2) {
        if(root == null){
            return null;
        }

        if(root.getData() == node1 || root.getData() == node2){
            return root;
        }

        TreeNode left_lca = findLowestCommonAncestor(root.getLeft(), node1, node2);
        TreeNode right_lca = findLowestCommonAncestor(root.getRight(), node1, node2);

        if(left_lca  != null && right_lca != null){
            return root;
        }

        return left_lca != null ? left_lca : right_lca;
    }

    public static Node findLowestCommonAncestor(Node root, Node n1, Node n2){
        return null;
    }
}

package tree;

public class FindDistanceBetweenTheTwoNode {

    public static void main(String[] args) {
        int distance = findDistanceBetweenTwoNode(TreeUtil.create(), 8, 18);
        System.out.println(distance);
    }

    private static int findDistanceBetweenTwoNode(TreeNode root, int node1, int node2) {
        if(root == null){
            return -1;
        }

        TreeNode lca = findLca(root, node1, node2);

        int lh = findHeight(lca, node1, 0);
        int rh = findHeight(lca, node2, 0);

        return lh+rh;
    }

    private static int findHeight(TreeNode root, int node, int height) {
        if(root == null){
            return 0;
        }

        if(root.getData() == node){
            return height;
        }
        int lh = findHeight(root.getLeft(), node, height+1);
        if(lh != 0){
            return lh;
        }

        return findHeight(root.getRight(), node, height+1);
    }

    private static TreeNode findLca(TreeNode root, int node1, int node2) {
        if(root == null){
            return null;
        }

        if(root.getData() == node1 || root.getData() == node2){
            return root;
        }

        TreeNode leftLca = findLca(root.getLeft(), node1, node2);
        TreeNode rightLca = findLca(root.getRight(), node1, node2);

        if(leftLca != null && rightLca != null){
            return root;
        }

        return leftLca != null ? leftLca : rightLca;
    }
}

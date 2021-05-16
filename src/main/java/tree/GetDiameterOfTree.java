package tree;

public class GetDiameterOfTree {

    private static int height;

    public static void main(String[] args) {
        TreeNode root = TreeUtil.create2();
        getDiameter(root);
        System.out.println(height);
    }

    private static int getDiameter(TreeNode node) {
        if(node == null){
            return 0;
        }

        if(node.getLeft() == null && node.getRight() == null){
            return 1;
        }

       int lh = getHeight(node.getLeft());
       int rh = getHeight(node.getRight());

       int temp = Math.max(lh, rh)+1;
       int ans = Math.max(temp, lh+rh+1);
       height = Math.max(ans, height);
       return temp;
    }

    private static int getHeight(TreeNode node) {
        if(node == null){
            return 0;
        }
        return Math.max(getHeight(node.getLeft()), getHeight(node.getRight())) +1;
    }
}

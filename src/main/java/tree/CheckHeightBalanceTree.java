package tree;

public class CheckHeightBalanceTree {
    public static void main(String[] args) {
        TreeNode root = TreeUtil.create3();
        boolean isHeightBalance = checkIfHeightBalanced(root);
        System.out.println(isHeightBalance);
    }

    private static boolean checkIfHeightBalanced(TreeNode node) {
        if(node == null){
            return true;
        }

        int lh = getHeight(node.getLeft());
        int rh = getHeight(node.getRight());

        return Math.abs(lh-rh) < 2
                && checkIfHeightBalanced(node.getLeft())
                && checkIfHeightBalanced(node.getRight());
    }

    private static int getHeight(TreeNode node) {
        if(node == null){
            return 0;
        }

        return Math.max(getHeight(node.getLeft()), getHeight(node.getRight()))+1;
    }
}

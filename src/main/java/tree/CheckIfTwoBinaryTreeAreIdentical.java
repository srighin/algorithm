package tree;

public class CheckIfTwoBinaryTreeAreIdentical {
    public static void main(String[] args) {
        TreeNode firstTree = TreeUtil.create();
        TreeNode secondTree = TreeUtil.create2();

        boolean isSame = checkIfSame(firstTree, secondTree);
        System.out.println(isSame);
    }

    private static boolean checkIfSame(TreeNode firstTree, TreeNode secondTree) {

        if (firstTree == null && secondTree == null) {
            return true;
        }

        if (firstTree == null || secondTree == null) {
            return false;
        }

        return firstTree.getData() == secondTree.getData() && checkIfSame(firstTree.getLeft(), secondTree.getLeft())
                && checkIfSame(firstTree.getRight(), secondTree.getRight());
    }
}

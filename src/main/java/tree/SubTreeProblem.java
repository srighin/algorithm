package tree;

public class SubTreeProblem {

    public static void main(String[] args) {
        TreeNode mainTree = TreeUtil.create();
        TreeNode subTree = TreeUtil.create2();

        boolean isSubTree = checkIfSubTree(mainTree, subTree);
        System.out.println(isSubTree);
    }

    private static boolean checkIfSubTree(TreeNode mainTree, TreeNode subTree) {
        if (mainTree == null && subTree == null) {
            return true;
        }

        if(subTree == null){
            return true;
        }

        if (mainTree.getData() != subTree.getData()) {
            return false;
        } else {
            return checkIfSubTree(mainTree.getLeft(), subTree.getLeft())
                    && checkIfSubTree(mainTree.getRight(), subTree.getRight());
        }

    }
}

package tree;

public class CheckIfTwoNodeAreSibling {

    public static void main(String[] args) {
        boolean isSibling = checkTwoNodeAreSibling(TreeUtil.create(), 4, 18);
        System.out.println(isSibling);
    }

    private static boolean checkTwoNodeAreSibling(TreeNode root, int left, int right) {
        if(root == null || root.getLeft() == null || root.getRight() == null){
            return false;
        }

        if((root.getLeft().getData() == left && root.getRight().getData() == right)
                ||(root.getLeft().getData() == right && root.getRight().getData() ==left)){
            return true;
        }

        return checkTwoNodeAreSibling(root.getLeft(), left, right) || checkTwoNodeAreSibling(root.getRight(), left, right);
    }
}

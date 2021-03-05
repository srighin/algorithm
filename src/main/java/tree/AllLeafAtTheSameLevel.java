package tree;

public class AllLeafAtTheSameLevel {
    private static int level;
    public static void main(String[] args) {
        TreeNode root = TreeUtil.create();
        boolean isAllAtSameLevel = checkAllLeafAtSameLevel(root, 0);
        System.out.println(isAllAtSameLevel);

    }

    private static boolean checkAllLeafAtSameLevel(TreeNode root, int currentLevel) {
        if(root == null){
            return false;
        }

        if(root.getLeft() == null && root.getRight() == null){
            if(level == 0){
                level = currentLevel;
            }
            if (currentLevel != level){
                return false;
            }
            return true;
        }

        return checkAllLeafAtSameLevel(root.getLeft(), currentLevel+1) &&
                checkAllLeafAtSameLevel(root.getRight(), currentLevel+1);
    }
}

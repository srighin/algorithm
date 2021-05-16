package tree;

public class CheckIfRootToLeafMatchesGivenSum {
    public static void main(String[] args) {
        TreeNode node = TreeUtil.create();
        boolean isPathExist = checkPathExist(node, 43);
        System.out.println(isPathExist);
    }

    private static boolean checkPathExist(TreeNode node, int sum) {
        if(node == null){
            return false;
        }

        sum = sum - node.getData();
        if(node.getLeft() == null && node.getRight() == null && sum == 0){
            return true;
        }

        return checkPathExist(node.getLeft(), sum) ||
                checkPathExist(node.getRight(), sum);
    }
}

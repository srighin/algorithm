package tree;

public class GetDifferenceAtEvenAndOddLevel {
    public static void main(String[] args) {
        TreeNode treeNode = TreeUtil.create();
        int difference = getDifferenceAtOddAndEvenLevel(treeNode);
        System.out.println(difference);
    }

    private static int getDifferenceAtOddAndEvenLevel(TreeNode treeNode) {
        if(treeNode == null){
            return 0;
        }

        return treeNode.getData()- getDifferenceAtOddAndEvenLevel(treeNode.getLeft())-getDifferenceAtOddAndEvenLevel(treeNode.getRight());
    }
}

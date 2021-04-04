package tree;

import static java.lang.Math.max;

public class PrintReverseLevelOrderWithRecursion {

    public static void main(String[] args) {
        printReverseLevelOrder(TreeUtil.create());
    }

    private static void printReverseLevelOrder(TreeNode treeNode) {
        if(treeNode == null){
            return;
        }
        int height = getHeight(treeNode);
        for(int i= height; i > 0; i--){
            printLevelOrder(treeNode, i);
            System.out.println();
        }
    }

    private static void printLevelOrder(TreeNode treeNode, int level) {
        if(treeNode == null || level == 0){
            return;
        }
        if (level == 1){
            System.out.print(treeNode.getData()+ " -> ");
        }
        printLevelOrder(treeNode.getLeft(), level-1);
        printLevelOrder(treeNode.getRight(), level-1);
    }

    private static int getHeight(TreeNode treeNode) {
        if(treeNode == null){
            return 0;
        }
        return 1+max(getHeight(treeNode.getLeft()), getHeight(treeNode.getRight()));
    }
}

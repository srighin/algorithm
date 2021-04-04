package tree;

import java.util.Stack;

public class PrintBinaryInOrderTreeWithoutUsingRecursion {
    public static void main(String[] args) {
        printBinaryTree(TreeUtil.create());
    }

    private static void printBinaryTree(TreeNode treeNode) {
        if(treeNode == null){
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
        while (treeNode != null){
            stack.add(treeNode);
            treeNode = treeNode.getLeft();
        }

        while(stack.size() >0){
            TreeNode tempNode = stack.pop();
            System.out.print(tempNode.getData()+" -> ");
            if(tempNode.getRight() != null){
                TreeNode tNode = tempNode.getRight();
                while (tNode != null){
                    stack.add(tNode);
                    tNode = tNode.getLeft();
                }
            }
        }
    }
}

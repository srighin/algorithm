package tree;

import java.util.Stack;

public class PrintPreOrderTraversalWithRecursion {
    public static void main(String[] args) {
        printPreOrderTraversal(TreeUtil.create());
    }

    private static void printPreOrderTraversal(TreeNode treeNode) {
        if(treeNode == null){
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(treeNode);
        while(!stack.isEmpty()){
            TreeNode currentNode = stack.pop();
            System.out.print(currentNode.getData()+" -> ");
            if(currentNode.getRight() != null){
                stack.push(currentNode.getRight());
            }
            if(currentNode.getLeft() != null){
                stack.push(currentNode.getLeft());
            }
        }
    }
}

package tree;

import java.util.Stack;

public class PrintPostOrderTraversalWithRecursion {
    public static void main(String[] args) {
        printPostOrder(TreeUtil.create());
    }

    private static void printPostOrder(TreeNode treeNode) {
        if(treeNode == null){
            return;
        }

        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();

        s1.push(treeNode);

        while (!s1.isEmpty()){
            TreeNode currentNode = s1.pop();
            if(currentNode.getLeft() != null){
                s1.push(currentNode.getLeft());
            }

            if(currentNode.getRight() != null){
                s1.push(currentNode.getRight());
            }

            s2.push(currentNode);
        }

        while (!s2.isEmpty()){
            System.out.print(s2.pop().getData()+" -> ");
        }
    }
}

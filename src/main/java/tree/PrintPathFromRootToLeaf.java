package tree;

public class PrintPathFromRootToLeaf {
    public static void main(String[] args) {
        TreeNode node = TreeUtil.create();
        int [] store = new int[10];
        printNodeFromRootToLeaf(node, store, 0);
    }

    private static void printNodeFromRootToLeaf(TreeNode node, int [] store, int currentIndex) {
        if(node == null){
            return;
        }

        store[currentIndex] = node.getData();
        if(node.getLeft() == null && node.getRight() == null){
            printNode(store, currentIndex);
        }

        printNodeFromRootToLeaf(node.getLeft(), store, currentIndex+1);
        printNodeFromRootToLeaf(node.getRight(), store, currentIndex+1);
    }

    private static void printNode(int[] store, int currentIndex) {
        for(int i=0; i<= currentIndex; i++){
            System.out.print(store[i]+" -> ");
        }
        System.out.println();
    }
}

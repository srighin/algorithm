package tree;

public class MirrorImageOfBinaryTree {

    public static void main(String[] args) {
        TreeNode originalTree = TreeUtil.create();
        preOrderTraversal(originalTree);
        System.out.println();
        System.out.println("---------MIRROR IMAGE-------");
        TreeNode mirrorTree = getMirrorImage(originalTree);
        preOrderTraversal(mirrorTree);
    }

    private static void preOrderTraversal(TreeNode node){
        if(node ==  null){
            return;
        }

        System.out.print(node.getData()+" -> ");
        preOrderTraversal(node.getLeft());
        preOrderTraversal(node.getRight());
    }

    private static TreeNode getMirrorImage(TreeNode originalTree) {
        if(originalTree == null){
            return null;
        }

        TreeNode temp = originalTree.getLeft();
        originalTree.setLeft(originalTree.getRight());
        originalTree.setRight(temp);

        getMirrorImage(originalTree.getLeft());
        getMirrorImage(originalTree.getRight());

        return originalTree;
    }

}

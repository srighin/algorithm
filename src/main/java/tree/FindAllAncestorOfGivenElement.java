package tree;

public class FindAllAncestorOfGivenElement {
    public static void main(String[] args) {
        findAllAncestor(TreeUtil.create(), 18);
    }

    private static boolean findAllAncestor(TreeNode treeNode, int element) {
        if(treeNode == null){
            return false;
        }

        if(treeNode.getData() == element){
            System.out.print(treeNode.getData()+" - > ");
            return true;
        }

        if(findAllAncestor(treeNode.getLeft(), element) || findAllAncestor(treeNode.getRight(), element)){
            System.out.print(treeNode.getData()+" -> ");
            return true;
        }

        return false;
    }
}

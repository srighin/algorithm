package tree;

public class PrintAncestorsOfGivenValue {

    public static void main(String[] args) {
        TreeNode root = TreeUtil.create();
        printAllAncestor(root, 4);

    }

    private static boolean printAllAncestor(TreeNode root, int value) {
        if(root== null){
            return false;
        }

        if(root.getData() == value){
            return true;
        }

        if(printAllAncestor(root.getLeft(), value) || printAllAncestor(root.getRight(), value)){
            System.out.println(root.getData() +" ");
            return true;
        }
        return false;
    }
}

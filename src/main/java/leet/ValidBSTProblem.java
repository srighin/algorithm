package leet;

public class ValidBSTProblem {

    public static void main(String[] args) {
        System.out.println();
    }

    public static boolean validateBst(BST tree) {
        if(tree == null){
            return true;
        }

        if(tree.left != null ){
            if(tree.value < tree.left.value){
                return false;
            } else {
                validateBst(tree.left);
            }
        }

        if(tree.right != null){
            if(tree.value > tree.right.value){
                return false;
            }else {
                validateBst(tree.right);
            }
        }

        return false;
    }



    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }
}

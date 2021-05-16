package tree;

public class CreateBinaryTreeFromPreOderAndInOrder {

    private static int preOrderIndex = 0;
    public static void main(String[] args) {
        int [] preOrder = {2, 4, 7, 3, 8};
        int [] inOrder = {7, 4, 3, 2, 8};

        TreeNode root  = createTree(preOrder, inOrder, 0, preOrder.length-1);
        root.levelOrderTraversal(root);

    }


    private static TreeNode createTree(int[] preOrder, int[] inOrder, int startIndex, int endIndex) {

        if(startIndex > endIndex){
            return null;
        }
        TreeNode node = new TreeNode(preOrder[preOrderIndex++]);
        if(startIndex == endIndex){
            return node;
        }

        int inOrderIndex = findInOrderIndex(inOrder, node.getData(), startIndex, endIndex);
        node.setLeft(createTree(preOrder, inOrder, startIndex, inOrderIndex-1 ));
        node.setRight(createTree(preOrder, inOrder, inOrderIndex+1, endIndex));

        return node;
    }

    private static int findInOrderIndex(int[] inOrder, int value, int startIndex, int endIndex) {
        int index = 0;

        for(int i = startIndex; i <= endIndex; i++){
            if(inOrder[i] == value){
                return index;
            }
            index++;
        }
        return index;
    }
}

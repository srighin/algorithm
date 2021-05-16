package tree;

public class ConvertTreeToDoublyLinkedList {

    private static TreeNode head;
    private static TreeNode prev;

    public static void main(String[] args) {
        TreeNode root = TreeUtil.create();
        convertTreeToDLL(root);
        printDll(head);
    }

    private static void printDll(TreeNode node) {

        while(node != null){
            System.out.print(node.getData()+ "  <-> ");
            node = node.next;
        }
    }

    private static TreeNode convertTreeToDLL(TreeNode root) {
        if(root == null){
            return null;
        }

        convertTreeToDLL(root.getLeft());
        if(prev == null){
            head = root;
            prev = root;
        }else {
           root.prev = prev;
           prev.next = root;
           prev = root;
        }

        return convertTreeToDLL(root.getRight());
    }
}


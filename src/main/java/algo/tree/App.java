package algo.tree;

public class App {
    public static void main(String[] args) {
        //CompareTress compareTress = new CompareTress();
        Tree<Integer> tree = new BinaryTree();
        tree.insert(12);
        tree.insert(24);
        tree.insert(2);
        tree.insert(9);

       /* Tree<Integer> secondTree = new BinaryTree();
        secondTree.insert(12);
        secondTree.insert(24);
        secondTree.insert(2);
        secondTree.insert(9);
        secondTree.insert(19);

        boolean comparisionResult = compareTress.compare(tree.getRoot(), secondTree.getRoot());
        System.out.println("Compare result of 2 trees: "+comparisionResult);*/

       //tree.findKthSmallestElement(2);
        System.out.println("Kth smallest: "+tree.findKthSmallestElement(1));
        System.out.println("Sum of edges: "+tree.sumAllEdges());

      /*  tree.traverse();
        System.out.println("---------------------");
        System.out.println("Max element: "+tree.getMax());
        System.out.println("---------------------");
        System.out.println("Min element: "+tree.getMin());
        System.out.println("---------------------");

        tree.delete(19);
        tree.traverse();*/
    }
}

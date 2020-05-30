package algo.tree;

public class CompareTress<T extends Comparable<T>> {

    public boolean compare(Node<T> firstTree, Node<T> secondTree){

        if(firstTree == null || secondTree == null)
            return firstTree == secondTree;

        if(firstTree.getData().compareTo(secondTree.getData()) != 0)
            return false;

        return compare(firstTree.getLeft(), secondTree.getLeft()) && compare(firstTree.getRight(), secondTree.getRight());
    }
}

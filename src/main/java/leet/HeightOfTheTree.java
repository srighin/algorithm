package leet;

import algo.tree.Node;

public class HeightOfTheTree {

    public static void main(String[] args) {

    }

    private static int height(Node<Integer> node){

        if(node == null){
            return 0;
        }
        int leftTreeHeight = height(node.getLeft());
        int rightTreeHeight = height(node.getRight());

        return Math.max(leftTreeHeight, rightTreeHeight) + 1;
    }
}

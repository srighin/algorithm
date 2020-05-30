package com.algorithm.dp.tree;

public class BST<T extends Comparable> {

    private Node root;

    public void insert(T data){
        if(root == null){
            root = new Node(data);
        } else {
            insertData(data, root);
        }
    }

    private void insertData(T data, Node<T> root) {

        if (root == null){

        }else{
            if (data.compareTo(root.getNode()) <= 0){
                insertData(data, root.getLeftNode());
            } else if(data.compareTo(root.getNode())> 0){
                insertData(data, root.getRighttNode());
            }
        }
    }
}

package com.linkedList;

import java.sql.Struct;

public class AddOneToListUsingNOde {

    public static void main(String[] args) {
        Node root = new Node(1);
       root.nextNode = new Node(9);
       root.nextNode.nextNode = new Node(9);
       root.nextNode.nextNode = new Node(9);

       while (root.nextNode != null){
           System.out.println(root.nextNode);
       }
    }
}
class Node{
    private int data;
    public Node nextNode;

    public Node(int data) {
        this.data = data;
    }

    public boolean hasNextNode(){
        return nextNode.getNextNode() != null ? true : false;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}

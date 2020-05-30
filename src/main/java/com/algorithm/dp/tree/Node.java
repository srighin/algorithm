package com.algorithm.dp.tree;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Node<T extends Comparable> {

    private Node<T> leftNode;
    private Node<T> righttNode;
    private T node;


    public Node(T data) {
        this.node = data;
        this.leftNode = new Node(null);
        this.righttNode = new Node(null);
    }

    @Override
    public String toString() {
        return "Node{" +
                "node=" + node +
                '}';
    }
}

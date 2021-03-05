package linkList;

import java.util.HashSet;
import java.util.Set;

public class LinkList {

    private Node head;

    public void add(int data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

    }

    private Node sortList(Node node) {

        if (node == null || node.next == null) {
            return node;
        }
        Node middleNode = getMiddle(node);
        Node secondHalf = middleNode.next;
        middleNode.next = null;

        return merge(sortList(node), sortList(secondHalf));
    }

    public Node merge(Node first, Node second) {
        Node temp = new Node(-1);
        Node result = temp;
        while (first != null && second != null) {
            if (first.data < second.data) {
                temp.next = first;
                first = first.next;
            } else {
                temp.next = second;
                second = second.next;
            }
            temp = temp.next;
        }

        temp.next = first != null ? first : second;
        return result.next;
    }


    public void print() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public void print(Node node) {
        Node currentNode = node;
        while (currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.print("null");
        System.out.println();
    }

    private int getLength(Node current) {
        if (current == null) {
            return 0;
        }

        return getLength(current.next) + 1;
    }

    public int getSize() {
        return getLength(head);
    }

    public void addNodeInEnd(int data) {
        Node currentNode = head;
        Node prev = null;

        while (currentNode != null) {
            prev = currentNode;
            currentNode = currentNode.next;
        }
        prev.next = new Node(data);

    }

    public void deleteLastNode() {
        Node currentNode = head;
        Node prev = null;

        if (currentNode == null || currentNode.next == null) {
            head = null;
        }

        while (currentNode != null && currentNode.next != null) {
            prev = currentNode;
            currentNode = currentNode.next;
        }

        if (prev != null) {
            prev.next = null;
        }

    }

    public void deleteBeginningNode() {
        deleteBeginningNode(head);
    }

    private void deleteBeginningNode(Node node) {

        if (node == null) {
            return;
        }

        head = node.next;
    }

    public void deleteFromGivenPosition(int position) {
        Node currentNode = head;
        int size = getLength(head);

        if (position > size || position < 0) {
            System.out.println("Invalid input");
        }

        Node prev = null;
        while (position > 0) {
            prev = currentNode;
            currentNode = currentNode.next;
            position--;
        }

        prev.next = currentNode.next;
    }

    private Node getMiddle(Node node) {
        Node current = node;
        if (current == null) {
            return current;
        }

        Node slowPointer = current;
        Node fastPointer = current;

        while (fastPointer != null && fastPointer.next != null && fastPointer.next.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
        }

        return slowPointer;
    }

    public Node getMiddle() {
        return getMiddle(head);
    }

    public void rotateClockWiseBy(int index) {
        // 30 -> 20 -> 10 -> 2 -> null
        int size = getLength(head);
        index = index % size;

        Node current = head;
        Node temp = null;

        while (size - index > 0) {
            temp = current;
            current = current.next;
            index++;
        }

        temp.next = null;
        Node tmp = current;

        while (current.next != null) {
            current = current.next;
        }
        current.next = head;
        head = tmp;
    }

    public Node findUnionNode(Node node1, Node node2){
        if(node1 == null && node2 == null){
            return null;
        }

        Node temp = new Node(-1);
        Node result = temp;
        Set<Integer> lookup = new HashSet<>();

        while (node1 != null){
            if(!lookup.contains(node1.data)){
                lookup.add(node1.data);
                temp.next = node1;
                temp = temp.next;
            }
            node1 = node1.next;
        }

        while(node2 != null){
            if(!lookup.contains(node2.data)){
                lookup.add(node2.data);
                temp.next = node2;
                temp = temp.next;
            }
            node2 = node2.next;
        }
        return result.next;
    }

    public Node sortList() {
        return sortList(head);
    }

    public Node removeDuplicate(Node node) {
        if (node == null || node.next == null) {
            return node;
        }
        Set<Integer> lookup = new HashSet<>();
        Node previous = node;
        Node result = node;
        while (node != null) {
            if (!lookup.contains(node.data)) {
                lookup.add(node.data);
            } else {
                previous.next = node.next;
                previous = previous.next;
            }
            node = node.next;
        }
        return result;
    }

    public Node getHead() {
        return head;
    }



    public Node reverse(Node node) {
        if (node == null || node.next == null) {
            return node;
        }

        Node prev, next, current;
        current = node;
        next = null;
        prev = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
}

class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
    }
}

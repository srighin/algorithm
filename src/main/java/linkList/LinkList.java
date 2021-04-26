package linkList;

import org.apache.poi.poifs.filesystem.NDocumentInputStream;

import java.sql.PreparedStatement;
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

    public Node sortList(Node node) {

        if (node == null || node.next == null) {
            return node;
        }
        Node middleNode = getMiddle(node);
        Node secondHalf = middleNode.next;
        middleNode.next = null;

        Node firstPart = sortList(node);
        Node secondPart = sortList(secondHalf);

        Node result = merge(firstPart, secondPart);

        return result;
    }

    private Node merge(Node firstList, Node secondList) {
        if(firstList == null && secondList == null){
            return null;
        }else if(firstList == null){
            return secondList;
        }else if(secondList == null){
            return firstList;
        }else{
            Node resultNode = new Node(-1);
            Node tmp = resultNode;
            while(firstList != null && secondList != null){
                if(firstList.data < secondList.data){
                    resultNode.next = firstList;
                    firstList = firstList.next;
                }else {
                    resultNode.next = secondList;
                    secondList = secondList.next;
                }
                resultNode = resultNode.next;
            }
            resultNode.next = firstList != null ? firstList: secondList;
            return tmp.next;
        }
    }

    /*public Node merge(Node first, Node second) {
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
    }*/


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
        if(current == null || current.next == null){
            return current;
        }
        Node slowPointer = current;
        Node fastPointer = current;

        while (fastPointer != null && fastPointer.next != null && fastPointer.next.next != null){
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
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

    /*public Node removeDuplicate(Node node) {
        if(node == null || node.next == null){
            return node;
        }
        if(node.data == node.next.data){
            node.next = node.next.next;
            removeDuplicate(node);
        }else {
            node = node.next;
            removeDuplicate(node);
        }
        return node;
    }*/

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

    public Node rotateListClockWise(int kPosition) {
        if(kPosition < 0){
            System.out.println("-ve number is allowed");
        }
        System.out.println("ROTATING BY "+kPosition+"th POSITION...");
        kPosition  = kPosition%getSize();

        kPosition = getSize() - kPosition;

        if(kPosition == 0 || kPosition == getSize()){
            return head;
        }
        Node tmp = head;
        while(tmp.next != null){
            tmp = tmp.next;
        }

        Node current = head;
        int index = 1;
        while(index < kPosition && current != null){
            current = current.next;
            index++;
        }
        tmp.next = head;
        head = current.next;
        current.next= null;
        return head;
    }

    public Node rotateListCounterClockWise(int kPosition) {
        if(kPosition< 0){
            System.out.println("-ve value not allowed");
            return head;
        }

        Node current = head;
        int index = 1;
        while (index < kPosition && current.next != null){
            current = current.next;
            index++;
        }

        Node kthNode = current;
        while (current.next != null){
            current = current.next;
        }

        current.next = head;
        head = kthNode.next;
        kthNode.next = null;
        return head;

    }

    public void findUnion(LinkList list2) {
        Node head1 = sortList();
        Node head2 = sortList(list2.head);
        Node result = new Node(-1);
        Node tmp = result;

        while(head1 != null && head2!= null){
            if(head1.data < head2.data){
                result.next = new Node(head1.data);
                head1 = head1.next;
            }else if(head1.data > head2.data) {
                result.next = new Node(head2.data);
                head2 = head2.next;
            }else{
                result.next = new Node(head1.data);
                head1 = head1.next;
                head2 = head2.next;
            }
            result = result.next;
        }

        result.next = head1 != null ?head1: head2;


        while (tmp != null){
            System.out.print(tmp.data+" -> ");
            tmp = tmp.next;
        }

    }

    public void intersection(Node anotherNode){

        Node result;
        if(head == null && anotherNode == null){
            result = null;
        }else if(head == null){
            result = anotherNode;
        }else if(anotherNode == null){
            result = head;
        }else {
            Node tmp = new Node(-1);
            result = tmp;
            Node head1 = sortList();
            Node sortedHead1 = head1;
            System.out.println("---- SORTED LIST 1 -----");
            while (sortedHead1 != null){
                System.out.print(sortedHead1.data+" -> ");
                sortedHead1 = sortedHead1.next;
            }
            Node head2 = sortList(anotherNode);
            while(head1 != null && head2 != null){
                if(head1.data == head2.data) {
                    tmp.next = new Node(head1.data);
                    head1 = head1.next;
                    head2 = head2.next;
                    tmp = tmp.next;
                }else if(head1.data < head2.data){
                    head1 = head1.next;
                }else{
                    head2 = head2.next;
                }
            }
            result = result.next;
            System.out.println();
            System.out.println("---- INTERSACTION LIST 1 -----");
            while (result != null){
                System.out.print(result.data+" -> ");
                result = result.next;
            }
        }

    }

    public void delete(int m, int n) {
        Node temp = head;
        Node result = head;

        int index = 1;
        while (index < n){
            temp = temp.next;
            index++;
        }
        Node anotherTmp = temp;
        index = 1;
        while (index <= m){
            anotherTmp = anotherTmp.next;
            index++;
        }
        temp.next = anotherTmp.next;

        while (result != null){
            System.out.print(result.data+" -> ");
            result = result.next;
        }
    }

    public void removeDuplicate() {
        Node temp = head;

        Set lookup = new HashSet();
        Node prev = null;
        while (temp !=null){
            if(lookup.contains(temp.data)){
                prev.next = temp.next;
                temp = temp.next;
            }else {
                lookup.add(temp.data);
                prev = temp;
                temp = temp.next;
            }
        }

        while (head != null){
            System.out.print(head.data+" -> ");
            head = head.next;
        }
    }

    public int getKthElement(int kthElement) {

        if(head == null || kthElement < 0){
            return -1;
        }

        Node temp = head;
        int index = 1;
        while(index < kthElement){
            index++;
            temp = temp.next;
        }

        return temp.data;
    }

    public void separateEvenOdd() {

        if(head == null || head.next == null){
            return;
        }

        Node evenStart, evenEnd, oddStart, oddEnd;
        evenStart = evenEnd = oddStart = oddEnd = null;

        while (head != null){
            if(head.data % 2 == 0){
                if(evenStart == null){
                    evenStart = head;
                    evenEnd = evenStart;
                }else {
                    evenEnd.next = head;
                    evenEnd = evenEnd.next;
                }
            }else {
                if(oddStart == null){
                    oddStart = head;
                    oddEnd = oddStart;
                }else {
                    oddEnd.next = head;
                    oddEnd = oddEnd.next;
                }
            }
            head = head.next;
        }

        evenEnd.next = oddStart;
        oddEnd.next = null;

        while (evenStart != null){
            System.out.print(evenStart.data+" -> ");
            evenStart = evenStart.next;
        }
    }
}

class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
    }
}

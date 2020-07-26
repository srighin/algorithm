package leet;

public class RemoveKthElementFromLastProblem {

    public static void main(String[] args) {
        LinkedList root = new LinkedList(1);
        LinkedList first = new LinkedList(2);
        LinkedList second = new LinkedList(3);
        LinkedList third = new LinkedList(4);
        root.next = first;
        first.next = second;
        second.next = third;
        removeKthNodeFromEnd(root, 4);

        while(root != null){
            System.out.println(root.value);
            root = root.next;
        }
    }

    public static void removeKthNodeFromEnd(LinkedList head, int k) {
        // Write your code here.
        LinkedList clonehead = head;
        int length = 0;
        while(clonehead.next != null){
            length++;
            clonehead = clonehead.next;
        }

        clonehead = head;
        int fromBegining = length - k +1;
        LinkedList pervNode = null;
        for(int i=0; i < fromBegining; i++){
            pervNode = clonehead;
            clonehead = clonehead.next;
        }
        if(pervNode != null) {
            pervNode.next = clonehead.next;
        } else {
            head.value = head.next.value;
            head.next = head.next.next;
        }
    }

    static class LinkedList {
        int value;
        LinkedList next = null;

        public LinkedList(int value) {
            this.value = value;
        }
    }
}



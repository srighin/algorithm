package linkList;

public class ReverseLinkedList {

    public static void main(String[] args) {
        LinkList linkList = new LinkList();
        linkList.add(10);
        linkList.add(20);
        linkList.add(30);
        linkList.add(40);
        linkList.add(50);

        linkList.print();

        Node reverseInGroup = reverseInGroup(linkList.getHead(), 3);
        linkList.print(reverseInGroup);
    }

    public static Node reverseInGroup(Node node, int k) {
        if (node == null || node.next == null) {
            return node;
        }
        Node prev = null;
        Node current = node;
        Node next = null;
        int counter = 0;

        while (current != null && counter < k){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            counter++;
        }

        if(next != null){
            node.next = reverseInGroup(next, k);
        }

        return prev;


    }
}

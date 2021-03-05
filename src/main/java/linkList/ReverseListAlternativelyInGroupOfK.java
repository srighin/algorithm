package linkList;

public class ReverseListAlternativelyInGroupOfK {
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

    private static Node reverseInGroup(Node node, int k) {
        if(node == null || node.next == null){
            return node;
        }

        Node prev = null;
        Node next = null;
        Node current = node;
        int counter = 0;

        while(current != null && counter > 0){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        if(current != null){

        }

        return prev;
    }
}

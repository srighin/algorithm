package linkList;

public class RearrangeALinkedListAroundAGivenValue {
    public static void main(String[] args) {
        Node head = new Node(22);
        Node node1 = new Node(3);
        Node node2 = new Node(1);
        Node node3 = new Node(2);
        Node node4 = new Node(5);
        Node node5 = new Node(3);


        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = null;

        Node temp = head;
        while (head != null){
            System.out.print(head.data+" -> ");
            head = head.next;
        }

        Node lowerHead, lowerTail, equalHead, equalTail, higherHead, higherTail;
        lowerHead = lowerTail = equalHead = equalTail = higherHead = higherTail = null;
        int targetValue = 3;
        head = temp;
        while (head != null){
            if(head.data < targetValue){
                if(lowerHead == null){
                    lowerHead = lowerTail = head;
                }else {
                    lowerTail.next = head;
                    lowerTail = lowerTail.next;
                }
            }else if(head.data == targetValue){
                if(equalHead == null){
                    equalHead = equalTail = head;
                }else {
                    equalTail.next = head;
                    equalTail = equalTail.next;
                }
            }else {
                if(higherHead == null){
                    higherHead = higherTail = head;
                }else {
                    higherTail.next = head;
                    higherTail = higherTail.next;
                }
            }
            head = head.next;
        }

        lowerTail.next = equalHead;
        equalTail.next = higherHead;
        higherTail.next = null;
        System.out.println();
        System.out.println("------ Result ------");
        while (lowerHead != null){
            System.out.print(lowerHead.data+" -> ");
            lowerHead = lowerHead.next;
        }
    }
}

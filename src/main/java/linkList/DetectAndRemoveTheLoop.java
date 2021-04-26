package linkList;

public class DetectAndRemoveTheLoop {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node secondNode = new Node(20);
        Node thirdNode = new Node(30);
        Node fourthNode = new Node(50);
        Node fifthNode = new Node(40);

        head.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        fourthNode.next = fifthNode;
        fifthNode.next = secondNode;

        Node slowPointer = head;
        Node fastPointer = head;

        boolean isLoopExist = false;

        while (fastPointer.next != null && fastPointer.next.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
            if (slowPointer == fastPointer) {
                isLoopExist = true;
                break;
            }
        }

        if(isLoopExist){
            slowPointer = head;
            while (slowPointer.next != fastPointer.next){
                slowPointer = slowPointer.next;
            }
            fastPointer.next = null;
        }

        while (head != null){
            System.out.print(head.data+" -> ");
            head = head.next;
        }
    }
}

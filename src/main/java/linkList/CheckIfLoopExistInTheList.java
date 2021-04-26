package linkList;

public class CheckIfLoopExistInTheList {
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

        while (fastPointer.next != null && fastPointer.next.next != null){
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
            if(slowPointer==fastPointer){
                System.out.println("Loop exist");
                break;
            }
        }
    }
}

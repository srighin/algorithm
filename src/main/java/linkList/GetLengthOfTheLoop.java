package linkList;

public class GetLengthOfTheLoop {

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

        while (fastPointer.next != null && fastPointer.next.next != null){
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
            if(slowPointer==fastPointer){
                isLoopExist = true;
                break;
            }
        }

        int length = 1;
        if(isLoopExist){
            slowPointer = slowPointer.next;
            while(slowPointer != fastPointer){
                slowPointer= slowPointer.next;
                length++;
            }
        }

        System.out.println("Length of the loop :: "+length);

    }
}

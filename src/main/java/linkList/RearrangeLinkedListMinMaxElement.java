package linkList;

public class RearrangeLinkedListMinMaxElement {
    public static void main(String[] args) {
        Node head = new Node(2);
        Node node1 = new Node(3);
        Node node2 = new Node(1);
        Node node3 = new Node(6);
        Node node4 = new Node(5);
        Node node5 = new Node(4);
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
        head = temp;
        head = sortLinkedList(head);
        temp = head;
        System.out.println();
        System.out.println("After sorting.....");
        while (head != null){
            System.out.print(head.data+" -> ");
            head = head.next;
        }

        System.out.println();
        System.out.println(" ----- Diving the list from middle ------");
        head = temp;
        Node middle = getMiddle(head);
        Node second = middle.next;
        middle.next = null;
        System.out.println("------ Reverse second half ----------");
        second = reverse(second);

        System.out.println(" ------ Linking Nodes from the 2 linkedList ------");

        Node result  = new Node(-1);
        Node tempResult = result;

        while(head != null && second != null){
            result.next = head;
            result = result.next;
            head = head.next;
            result.next = second;
            second = second.next;
            result = result.next;
        }
        result.next = head  != null ? head : second;
        tempResult = tempResult.next;
        System.out.println("------- Final result ---------");
        while (tempResult != null){
            System.out.print(tempResult.data+" -> ");
            tempResult = tempResult.next;
        }
    }

    private static Node reverse(Node head) {
        if(head == null || head.next == null){
            return head;
        }

        Node current, next, prev;
        current = head;
        prev = null;

        while (current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current =next;
        }
        return prev;
    }

    private static Node sortLinkedList(Node head) {
        if(head == null || head.next== null){
            return head;
        }

        Node middle = getMiddle(head);
        Node second = middle.next;
        middle.next = null;
        return merge(sortLinkedList(head), sortLinkedList(second));
    }

    private static Node merge(Node firstNode, Node secondNode) {
        Node result  = null;
        if(firstNode == null && secondNode == null){
            return null;
        }else if(firstNode == null ){
            return secondNode;
        }else if(secondNode == null){
            return firstNode;
        }else {
            Node temp = new Node(-1);
            result = temp;
            while (firstNode != null && secondNode != null){
                if(firstNode.data < secondNode.data){
                    temp.next = firstNode;
                    firstNode = firstNode.next;
                }else {
                    temp.next = secondNode;
                    secondNode = secondNode.next;
                }
                temp = temp.next;
            }
            temp.next = firstNode != null ? firstNode : secondNode;
        }
        return result.next;
    }

    private static Node getMiddle(Node head) {
        if(head == null || head.next ==  null){
            return head;
        }
        Node slow, fast;
        slow = fast = head;
        while(fast.next != null && fast.next.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}

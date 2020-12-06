package leet;

public class FindLoopProblem {

    public static LinkedList findLoop(LinkedList head) {
        LinkedList fast = head;
        LinkedList slow = head;

        while(fast.value != slow.value){
            fast = fast.next.next;
            slow = slow.next;
        }

        slow = head;
        while (slow.value != fast.value){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    static class LinkedList {
        int value;
        LinkedList next = null;

        public LinkedList(int value) {
            this.value = value;
        }
    }

}

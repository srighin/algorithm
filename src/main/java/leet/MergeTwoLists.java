package leet;

import java.util.PriorityQueue;

public class MergeTwoLists {

    public static void main(String[] args) {

        int [] sticks = {2, 4, 3};
        System.out.println("---> "+minimumCostToConnectStick(sticks));
    }

    private static int minimumCostToConnectStick(int [] sticks){
        int cost = 0;
        PriorityQueue<Integer> minHeap = new PriorityQueue();
        for (int stick: sticks){
            minHeap.add(stick);
        }
        while(minHeap.size() > 1){
            int sum = minHeap.remove() + minHeap.remove();
            cost += sum;
            minHeap.add(cost);
        }

        return cost;
    }


    private static String sumOfTwoNumber(String s1, String s2){

        int i = s1.length()-1;
        int j = s2.length()-1;
        int carry = 0;
        StringBuilder result = new StringBuilder();

        while(i >= 0 || j >= 0){
            int sum = carry;

            if(i >= 0){
                sum += s1.charAt(i--) - '0';
            }

            if(j>= 0){
                sum += s2.charAt(j--) - '0';
            }

            result.append(sum % 10);
            carry = sum / 10;
        }

        if(carry != 0){
            result.append(carry);
        }

        return result.reverse().toString();
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;
        while (l1 != null && l2 != null){

            if(l1.val < l2.val){
                dummy.next = l1;
                l1 = l1.next;
            } else {
                dummy.next = l2;
                l2 = l2.next;
            }
            dummy = dummy.next;
        }

        if(l1 != null){
            dummy.next = l1;
        } else{
            dummy.next = l2;
        }

        return head.next;
    }
}



class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

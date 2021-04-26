package linkList;

import java.util.HashMap;
import java.util.Map;

public class CloneList {
    public static void main(String[] args) {
        NodeRandom head = createNode();
        createClone(head);
    }

    private static void createClone(NodeRandom head) {

      NodeRandom firstHead, secondHead, firstNode, secondNode;
      firstHead  = firstNode = head;
      secondHead = secondNode = null;
      Map<NodeRandom, NodeRandom> lookup = new HashMap<>();

      while (firstNode != null){
          NodeRandom newNode = new NodeRandom(firstNode.data);
          if(secondHead == null){
              secondHead = newNode;
              secondNode = newNode;
          }else {
              secondNode.next = newNode;
              secondNode = newNode;
          }
          lookup.put(firstHead, newNode);
          firstNode = firstNode.next;
      }

      firstNode = firstHead;
      secondNode = secondHead;

      while (firstNode != null){
          if(firstNode.random != null){
              secondNode.random = lookup.get(firstNode.random);
          }
          firstNode = firstNode.next;
          secondNode = secondNode.next;
      }
      secondNode = secondHead;
        System.out.println("------ NEXT NODE-------");
      while (secondNode != null){
          System.out.print(secondNode.data+" -> ");
          secondNode = secondNode.next;
      }
        System.out.println("------ RANDOM NODE-------");
        secondNode = secondHead;
        while (secondNode != null){
            System.out.print(secondNode.data+" -> ");
            secondNode = secondNode.random;
        }
    }

    private static NodeRandom createNode(){
        NodeRandom head = new NodeRandom(10);
        NodeRandom node1 = new NodeRandom(20);
        NodeRandom node2 = new NodeRandom(30);
        NodeRandom node3 = new NodeRandom(40);
        NodeRandom node4 = new NodeRandom(50);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = null;

        head.random = node3;
        node3.random = node4;
        node4.random = node2;
        node2.random = node1;
        node1.random = null;
        NodeRandom temp = head;
        while (temp != null){
            System.out.print(temp.data+ " -> ");
            temp = temp.next;
        }
        System.out.println();
        temp = head;
        while (temp != null){
            System.out.print(temp.data+ " -> ");
            temp = temp.random;
        }
        System.out.println();
        return head;
    }
}

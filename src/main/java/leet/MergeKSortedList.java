package leet;



import algo.list.LinkedList;
import algo.list.Node;

import java.util.PriorityQueue;

public class MergeKSortedList {

    public static void main(String[] args) {
        Node[] nodes = new Node[5];
        LinkedList<Integer> firstList = new LinkedList();
        firstList.add(1);
        firstList.add(3);
        firstList.add(5);
        nodes[0] = firstList.getRoot();

        LinkedList<Integer> secondList = new LinkedList();
        secondList.add(2);
        secondList.add(4);
        secondList.add(6);
        nodes[1] = secondList.getRoot();

        Node root = mergeKSortedList(nodes);
        while(root != null){
            System.out.print(root.getData());
            root = root.getNextNode();
        }
    }

    private static Node mergeKSortedList(Node[] nodes) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int i=0; i< nodes.length; i++){
            Node<Integer> head = nodes[i];
            while (head!= null){
                minHeap.add(head.getData());
                head = head.getNextNode();
            }
        }

        Node dummyNode = new Node(-1);
        Node root = dummyNode;

        while(!minHeap.isEmpty()){
            root.setNextNode(new Node(minHeap.remove()));
            root = root.getNextNode();
        }
        return dummyNode.getNextNode();
    }
}

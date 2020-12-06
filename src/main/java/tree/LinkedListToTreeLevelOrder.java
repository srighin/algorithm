package tree;


import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedListToTreeLevelOrder {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(12);
        list.add(14);
        list.add(2);
        list.add(10);
        list.add(11);
        int count = 0;

        Queue<Node> q = new LinkedList<>();
        Node root = new Node(list.get(count++));
        q.add(root);

        while(!q.isEmpty()){
            Node leftNode = null;
            Node righttNode = null;
            Node root1 = q.remove();
            if(count < list.size()){
                leftNode = new Node(list.get(count++));
                q.add(leftNode);
            }
            if(count < list.size()){
                righttNode = new Node(list.get(count++));
                q.add(righttNode);
            }

            root1.setLeftNode(leftNode);
            root1.setRightNode(righttNode);
        }

        //traverseTree(root);

    }

    private static void traverseTree(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            Node root1 = q.remove();
            System.out.println(root1.getData());
            q.add(root1.getLeftNode());
            q.add(root1.getRightNode());
        }
    }
}

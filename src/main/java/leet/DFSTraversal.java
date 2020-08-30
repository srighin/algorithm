package leet;

import java.util.ArrayList;
import java.util.List;

public class DFSTraversal {

    static class Node {
        String name;
        List<Node> children = new ArrayList<Node>();

        public Node(String name) {
            this.name = name;
        }

        public List<String> depthFirstSearch(List<String> array) {
            String currentNode = this.name;
            //array.addAll(this)
            return array;
        }

        public Node addChild(String name) {
            Node child = new Node(name);
            children.add(child);
            return this;
        }
    }

    public static void main(String[] args) {

    }


}

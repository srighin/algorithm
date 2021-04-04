package tree;

import java.util.*;

public class GetTopViewOfTree {
    public static void main(String[] args) {
        List<Integer> listOfElement = getListOfElement(TreeUtil.create());
        for(int num: listOfElement){
            System.out.print(num+" -> ");
        }
    }

    private static List<Integer> getListOfElement(TreeNode treeNode) {
        List<Integer> list = new LinkedList<>();
        if(treeNode == null){
            return list;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(treeNode);
        Map<Integer, Integer> lookup = new TreeMap<>();

        while(!queue.isEmpty()){

            TreeNode currentNode = queue.poll();
            int height = currentNode.getHeight();
            if(lookup.get(height) == null){
                lookup.put(height, currentNode.getData());
            }

            if(currentNode.getLeft() != null){
                int leftHeight = height -1;
                currentNode.getLeft().setHeight(leftHeight);
                queue.add(currentNode.getLeft());
            }

            if(currentNode.getRight() != null){
                currentNode.getRight().setHeight(height+1);
                queue.add(currentNode.getRight());
            }
        }

        for(Map.Entry<Integer, Integer> entry: lookup.entrySet()){
            list.add(entry.getValue());
        }

        return list;
    }
}

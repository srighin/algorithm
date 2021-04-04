package tree;

import java.util.*;

public class PrintVerticalOrderOfBinaryTree {
    public static void main(String[] args) {
        printVerticalOrderOfTree(TreeUtil.create());
    }

    private static void printVerticalOrderOfTree(TreeNode treeNode) {
        if(treeNode == null){
            return;
        }

        Map<Integer, List<Integer>> result = new HashMap<>();
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(treeNode);
        while (!queue.isEmpty()){
            TreeNode currentNode = queue.poll();
            int height =currentNode.getHeight();
            if(result.get(height) == null){
                List<Integer> list = new ArrayList<>();
                list.add(currentNode.getData());
                result.put(height, list);
            }else{
                List<Integer> tempList = result.get(height);
                tempList.add(currentNode.getData());
            }

            if(currentNode.getLeft() != null){
                currentNode.getLeft().setHeight(height-1);
                queue.add(currentNode.getLeft());
            }

            if(currentNode.getRight() != null){
                currentNode.getRight().setHeight(height+1);
                queue.add(currentNode.getRight());
            }
        }

        for (Map.Entry<Integer, List<Integer>> entry: result.entrySet()){
            System.out.println(entry);
        }
    }
}

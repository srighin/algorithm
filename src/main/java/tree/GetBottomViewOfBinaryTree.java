package tree;

import org.springframework.data.mongodb.core.aggregation.ArrayOperators;

import java.util.*;

public class GetBottomViewOfBinaryTree {
    public static void main(String[] args) {
        List<Integer> bottomViewList = getBottomView(TreeUtil.create());
        bottomViewList.stream().forEach(e -> System.out.print(e+" -> "));
    }

    private static List<Integer> getBottomView(TreeNode treeNode) {
        List<Integer> result = new ArrayList<>();
        if(treeNode == null){
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        Map<Integer, Integer> lookup = new TreeMap<>();
        queue.add(treeNode);
        while (!queue.isEmpty()){
            TreeNode currentNode = queue.poll();
            int height = currentNode.getHeight();
            lookup.put(height, currentNode.getData());
            //result.add(currentNode.getData());
            if(currentNode.getLeft() != null){
                currentNode.getLeft().setHeight(height-1);
                queue.add(currentNode.getLeft());
            }
            if(currentNode.getRight() != null){
                currentNode.getRight().setHeight(height+1);
                queue.add(currentNode.getRight());
            }
        }

        for (Map.Entry<Integer, Integer> entry: lookup.entrySet()){
            result.add(entry.getValue());
        }
        return result;
    }
}

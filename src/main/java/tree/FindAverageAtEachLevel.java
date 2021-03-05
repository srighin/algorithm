package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FindAverageAtEachLevel {
    public static void main(String[] args) {
        List<Integer> average = findAverage(TreeUtil.create());
        average.stream().forEach(num -> System.out.println(num+" "));
    }

    private static List<Integer> findAverage(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(true){

            int size = q.size();
            if(size == 0){
                break;
            }
            int sum = 0;
            int elementCount = 0;

            while (size >0){
                TreeNode currentNode = q.remove();
                sum+=currentNode.getData();

                if(currentNode.getLeft() != null){
                    q.add(currentNode.getLeft());
                }
                if(currentNode.getRight()!=null){
                    q.add(currentNode.getRight());
                }
                size--;
                elementCount++;
            }
            result.add(sum/elementCount);
        }
        return result;
    }
}

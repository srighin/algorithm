package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FindTheAverageAtEachLevel {

    public static void main(String[] args) {
        List<Integer> averages = findTheAverageAtEachLevel(TreeUtil.create());
        System.out.println(averages);
    }

    private static List<Integer> findTheAverageAtEachLevel(TreeNode treeNode) {
        List<Integer> averages = new ArrayList<>();
        if(treeNode ==  null){
            return averages;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(treeNode);

        while (!queue.isEmpty()){
            int size = queue.size();
            if(size == 0){
                break;
            }

            int sum = 0;
            int numberOfElement = 0;

            while(size > 0){

                TreeNode currentNode = queue.poll();
                sum+=currentNode.getData();
                numberOfElement++;

                if(currentNode.getLeft() != null){
                    queue.add(currentNode.getLeft());
                }

                if(currentNode.getRight() != null){
                    queue.add(currentNode.getRight());
                }

                size --;
            }
            averages.add(sum/numberOfElement);
        }
        return averages;
    }
}

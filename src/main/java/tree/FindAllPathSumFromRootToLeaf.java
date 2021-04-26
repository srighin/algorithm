package tree;

import java.util.ArrayList;
import java.util.List;

public class FindAllPathSumFromRootToLeaf {
    public static void main(String[] args) {
        List<Integer> path = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        findAllPathFromRootToLeafWithGivenSum(TreeUtil.create(), 20,path, result);
       for (List<Integer> tempList : result){
           for(int num: tempList){
               System.out.print(num+ " - > ");
           }
           System.out.println();
       }
    }

    private static void findAllPathFromRootToLeafWithGivenSum(TreeNode treeNode, int sum, List<Integer> path, List<List<Integer>> result) {
        if(treeNode ==  null){
            return;
        }
        path.add(treeNode.getData());
        if(treeNode.getLeft() == null && treeNode.getRight() == null && treeNode.getData() == sum){
            result.add(new ArrayList<>(path));
        }else {
            findAllPathFromRootToLeafWithGivenSum(treeNode.getLeft(), sum - treeNode.getData(), path, result);
            findAllPathFromRootToLeafWithGivenSum(treeNode.getRight(), sum - treeNode.getData(), path, result);
        }
        path.remove(path.size() - 1);

    }
}

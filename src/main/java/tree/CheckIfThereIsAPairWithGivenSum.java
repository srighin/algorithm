package tree;

import java.util.HashSet;
import java.util.Set;

public class CheckIfThereIsAPairWithGivenSum {

    private static Set<Integer> lookup = new HashSet<>();

    public static void main(String[] args) {
        boolean isPairExist = checkIfPairExist(TreeUtil.create(), 13);
        System.out.println(isPairExist);
    }

    private static boolean checkIfPairExist(TreeNode treeNode, int sum) {
        if(treeNode == null){
            return false;
        }
        lookup.add(treeNode.getData());
        if(lookup.contains(sum - treeNode.getData())){
            return true;
        }
        if(treeNode.getLeft() != null && checkIfPairExist(treeNode.getLeft(), sum)){
            return true;
        }
        return checkIfPairExist(treeNode.getRight(), sum);

    }
}

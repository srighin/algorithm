package tree;

import java.util.HashSet;
import java.util.Set;

public class CheckPairWithGivenSum {

    private static Set<Integer> lookup = new HashSet<>();

    public static void main(String[] args) {
        boolean isPairExist = checkForPairWithGivenSum(TreeUtil.create(), 19);
        System.out.println(isPairExist);
    }

    private static boolean checkForPairWithGivenSum(TreeNode treeNode, int sum) {
        if(treeNode == null){
            return false;
        }
        if(lookup.contains(sum -  treeNode.getData())){
            return true;
        }
        lookup.add(treeNode.getData());
        return checkForPairWithGivenSum(treeNode.getLeft(), sum) || checkForPairWithGivenSum(treeNode.getRight(), sum);

    }
}

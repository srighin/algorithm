package tree;

import java.util.ArrayList;
import java.util.List;

public class PrintAllTheNodeFromRootToLeafWithGivenSum {

    public static void main(String[] args) {
        List<Integer> singlePath = new ArrayList<>();
        List<List<Integer>> allSum = new ArrayList<>();
        findAllNode(TreeUtil.create(), 43, singlePath, allSum);

        for (List<Integer> list : allSum) {
            for (int node : list) {
                System.out.println(node);
            }
        }

    }

    private static void findAllNode(TreeNode root, int sum, List<Integer> singlePath, List<List<Integer>> allSum) {

        if (root == null) {
            return;
        }

        singlePath.add(root.getData());

        if (root.getLeft() == null && root.getRight() == null && root.getData() == sum) {
           allSum.add(new ArrayList<>(singlePath));
        } else {
            findAllNode(root.getLeft(), sum - root.getData(), singlePath, allSum);
            findAllNode(root.getRight(), sum - root.getData(), singlePath, allSum);
        }

        singlePath.remove(singlePath.size() - 1);
    }
}

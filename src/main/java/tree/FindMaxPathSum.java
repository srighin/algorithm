package tree;

import static java.lang.Math.*;

public class FindMaxPathSum {

    public static void main(String[] args) {
        Node root = new Node(10);
        Node left = new Node(8);
        Node leftLeft = new Node(3);
        Node leftRight = new Node(5);
        Node right = new Node(2);

        root.setLeftNode(left);
        root.setRightNode(right);
        left.setLeftNode(leftLeft);
        left.setRightNode(leftRight);

        Result result = new Result();
        result.res = Integer.MIN_VALUE;
        //Integer res = Integer.MIN_VALUE;
        findMaxSum(root, result);
        System.out.println("Max Sum :: "+result.res);
    }



    private static int findMaxSum(Node root, Result result) {
        if (root == null){
            return 0;
        }

        int left = findMaxSum(root.getLeftNode(), result);
        int right = findMaxSum(root.getRightNode(), result);

        int maxSingle = max(max(left, right)+root.getData(), root.getData());

        int maxTop = max(maxSingle, left+right+root.getData());

        result.res = max(maxTop, result.res);

        return maxSingle;
    }
}

class Result {
    int res;
}
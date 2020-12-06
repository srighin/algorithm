package tree.max;

import tree.Node;

public class FindMaxInTree {

    public int getMax(Node root){
        int max = Integer.MIN_VALUE;

        if (root == null) return max;

        int leftMax = getMax(root.getLeftNode());
        int rightMax = getMax(root.getRightNode());

        if(rightMax > leftMax){
            max = rightMax;
        }else {
            max = leftMax;
        }

        if(root.getData() > max){
            max = root.getData();
        }

        return max;
    }
}

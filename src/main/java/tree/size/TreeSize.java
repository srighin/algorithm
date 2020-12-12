package tree.size;

import tree.Node;

public class TreeSize {

    public int findSize(Node root){
        if(root == null){
            return 0;
        }
        int left = findSize(root.getLeftNode());
        int right = findSize(root.getRightNode());

        return left+right+1;
    }
}

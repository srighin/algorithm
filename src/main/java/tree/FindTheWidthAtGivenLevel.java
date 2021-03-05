package tree;

import java.util.LinkedList;
import java.util.Queue;

public class FindTheWidthAtGivenLevel {

    public static void main(String[] args) {
        TreeNode root = TreeNode.create();
        int width = getWidthAtGivenLevel(root, 2);
        System.out.println(width);
    }

    private static int getWidthAtGivenLevel(TreeNode root, int level) {

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int width = 0;
        int currentLevel = 1;

        while (!q.isEmpty()){
            int size = q.size();
            width = size;
            if (currentLevel == level){
                break;
            }

            while(size >=0){
                TreeNode current = q.remove();

                if(current.getLeft()!= null){
                    q.add(current.getLeft());
                }
                if(current.getRight() != null){
                    q.add(current.getRight());
                }
                size--;
            }
            currentLevel ++;
        }
        return width;
    }
}

package tree;

import java.util.ArrayList;
import java.util.List;

public class PrintAllPathWithGivenSum {

    private static List<Integer> elements = new ArrayList<>();

    public static void main(String[] args) {
        printAllPath(TreeUtil.create(), 10);
    }

    private static void printAllPath(TreeNode root, int givenSum) {
        if(root == null){
            return;
        }

        elements.add(root.getData());
        printAllPath(root.getLeft(), givenSum);
        printAllPath(root.getRight(), givenSum);

        int sum =0;

        for(int i =0; i < elements.size(); i++){
            sum +=elements.get(i);
            if(sum == givenSum){
                for (int j=i; j< elements.size(); j++){
                    System.out.print(elements.get(j)+ " ");
                }
                System.out.println();
            }
        }

        elements.remove(elements.size() - 1);
    }
}

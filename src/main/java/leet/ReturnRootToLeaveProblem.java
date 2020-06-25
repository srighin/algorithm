package leet;

import algo.tree.BinaryTree;
import algo.tree.Node;
import algo.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class ReturnRootToLeaveProblem {

    public static void main(String[] args) {
        Tree<Integer> tree = new BinaryTree();
        tree.insert(12);
        tree.insert(24);
        tree.insert(2);
        tree.insert(9);

        List<String> result = returnRootToLeaveProblem(tree.getRoot());
        result.stream().forEach(System.out::println);
    }

    private static List<String> returnRootToLeaveProblem(Node<Integer> root) {
        List<String> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        dfs(root, "", result);
        return result;
    }

    private static void dfs(Node<Integer> root, String path, List<String> paths) {
        path+=root.getData();
        if(root.getLeft() == null && root.getRight() == null){
            paths.add(path);
            return;
        }

        if(root.getLeft() != null){
            dfs(root.getLeft(), path+"->", paths);
        }

        if(root.getRight() != null){
            dfs(root.getRight(), path+"->", paths);
        }
    }
}

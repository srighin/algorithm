package tree;

public class LowestCommonAncestor {

    public Node findLowestCommonAncestor(Node root, Node n1, Node n2){
        while(root !=null){
            if(root.getData() > n1.getData() && root.getData() > n2.getData()){
                root = root.getLeftNode();
            }else if(root.getData() < n1.getData() && root.getData() < n2.getData()){
                root = root.getRightNode();
            }else{
                break;
            }
        }
        return root;
    }
}

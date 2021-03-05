package linkList;

public class LinkListUtils {

    private static LinkList list;

    public static void create(){
        list = new LinkList();
        list.add(10);
        list.add(20);
        list.add(30);
    }

    public static void create2(){
        list = new LinkList();
        list.add(2);
        list.add(3);
        list.add(4);
    }

    public static void addNodeInEnd(int data){
        list.addNodeInEnd(data);
    }
    public static void print(){
        list.print();
    }
}

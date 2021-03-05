package linkList;

public class App {
    public static void main(String[] args) {
        LinkList linkList = create();
        linkList.print();
        LinkList linkList2 = create2();
        linkList2.print();
        Node unionNode = linkList.findUnionNode(linkList.getHead(), linkList2.getHead());
        linkList.print(unionNode);

    }

    public static LinkList create(){
        LinkList list = new LinkList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(30);

        return list;
    }

    public static LinkList create2(){
        LinkList list = new LinkList();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);

        return list;
    }

    public static LinkList createAnother(){
        LinkList list = new LinkList();
        list.add(10);
        list.add(27);
        list.add(6);

        return list;
    }
}

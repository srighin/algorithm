package linkList;

public class GetMiddleElement {
    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.add(60);
        list.add(50);
        list.add(40);
        list.add(30);
        list.add(20);
        list.add(10);

        list.print();
        Node middle = list.getMiddle();
        System.out.println(middle.data);
    }
}

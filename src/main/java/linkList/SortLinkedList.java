package linkList;

public class SortLinkedList {
    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.add(60);
        list.add(40);
        list.add(50);
        list.add(30);
        list.add(10);
        list.add(20);

        list.print();
        list.sortList();
        list.print();
    }
}

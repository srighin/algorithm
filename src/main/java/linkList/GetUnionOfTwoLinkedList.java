package linkList;

public class GetUnionOfTwoLinkedList {
    public static void main(String[] args) {
        LinkList list1 = new LinkList();
        list1.add(60);
        list1.add(40);
        list1.add(50);
        list1.add(50);
        list1.add(50);
        list1.add(30);
        list1.add(10);
        list1.add(20);

        list1.print();

        LinkList list2 = new LinkList();
        list2.add(100);
        list2.add(120);
        list2.add(50);
        list2.add(130);
        list2.add(10);
        list2.add(190);

        list2.print();

        System.out.println("!!!!!!!  UNION !!!!!!!");
        list1.findUnion(list2);
        System.out.println("!!!!!!!  INTERSECTION !!!!!!!");
        list1.intersection(list2.getHead());

    }
}

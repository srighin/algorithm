package linkList;

public class DeleteNNodeAfterMNode {

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
        System.out.println();
        list1.delete(3, 2);
    }
}

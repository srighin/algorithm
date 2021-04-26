package linkList;

public class SeparateEvenAndOdd {
    public static void main(String[] args) {
        LinkList list1 = new LinkList();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);

        list1.print();
        System.out.println();
        list1.separateEvenOdd();
    }
}

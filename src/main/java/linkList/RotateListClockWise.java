package linkList;

public class RotateListClockWise {
    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.add(50);
        list.add(40);
        list.add(30);
        list.add(20);
        list.add(10);

        list.print();
        list.rotateListClockWise(2);
        list.print();
    }
}

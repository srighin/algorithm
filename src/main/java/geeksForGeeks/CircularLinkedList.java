package geeksForGeeks;

public class CircularLinkedList {

    public static void main(String[] args) {
        CustomList list1 = new CustomList(1);
        CustomList list2 = new CustomList(1);
        CustomList list3 = new CustomList(1);
        CustomList list4 = new CustomList(1);

        list1.setNext(list2);
        list2.setNext(list3);
        list3.setNext(list4);
        list4.setNext(null);

        CustomList temp1 = list1;
        CustomList temp2 = list1;
        boolean hasLoop = false;

        while (temp2 != null && temp2.getNext() != null){
            temp1 = temp1.getNext();
            temp2 = temp2.getNext().getNext();

            if(temp1 == temp2){
                hasLoop = true;
                //System.out.println("Loop found..");
                break;
            }
        }

        System.out.println(hasLoop);

    }
}

class CustomList{
    private int data;
    private CustomList next;

    public CustomList(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public CustomList getNext() {
        return next;
    }

    public void setNext(CustomList next) {
        this.next = next;
    }
}

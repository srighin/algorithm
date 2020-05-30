package algo.list;

public class App {

    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("Sriman");
        list.add("Shilpi");
        list.add("Rithika");
        list.add("ashwin");
        list.add("suresh");

        list.traverse();
        list.reverse();
        System.out.println();
        list.traverse();
        /*list.traverse();
        System.out.println("\nMiddle element:: "+list.getMiddleElement());
        list.remove("Shilpi");
        System.out.println();
        list.traverse();
        System.out.println("\nMiddle element:: "+list.getMiddleElement());*/
    }
}

public class StringPadding {

    public static void main(String[] args) {
        String result
                = String.format("%" + -10 + "s", "input");
        System.out.println(result);
    }
}

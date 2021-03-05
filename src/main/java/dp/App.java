package dp;

public class App {
    public static void main(String[] args) {
        FindFibonacci findFibonacci = new FindFibonacci();
        // 0 1 1 2, 3, 5, 8
        System.out.println(findFibonacci.getFibUsingBackTracking(7));
        System.out.println(findFibonacci.getFibLookUp(7));
    }
}

package multithreading;

import java.util.concurrent.CompletableFuture;

public class ExecuteServiceDemo {
    public static void main(String[] args) throws InterruptedException {
        //CPU intensive operation
        ExecuteServiceDemo demo = new ExecuteServiceDemo();
        demo.instanceMethod(demo);

        Thread.sleep(5000);
    }

    public void instanceMethod(ExecuteServiceDemo demo){
        CompletableFuture.supplyAsync(() -> testCallBack())
                .thenAccept((value) -> calculateSum(value));
    }

    private static int sum = 0;

    private void calculateSum(int num) {
        sum+=num;
        System.out.println(sum);
    }

    private Integer testCallBack() {
        System.out.println("In test callBack");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return 15;
    }
}

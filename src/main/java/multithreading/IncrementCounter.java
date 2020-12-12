package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.LongAccumulator;

public class IncrementCounter {

    public static void main(String[] args) throws InterruptedException {
        //LongAdder count = new LongAdder();
        LongAccumulator count = new LongAccumulator((x, y) -> x+y, 0);
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for(int i=0; i<1000; i++){
            executorService.execute(() -> {
                increment(count);
            });
        }
        executorService.shutdown();
        System.out.println("Counter:: "+count.get());
    }

    private static void increment(LongAccumulator count) {
        count.accumulate(1);
    }
}

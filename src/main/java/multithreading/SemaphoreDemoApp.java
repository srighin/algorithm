package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SemaphoreDemoApp {
    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();

        for(int i =0 ; i< 12; i++){
            service.submit(() -> {
                Downloader.INSTANCE.download();
            });
        }

        try {
            service.awaitTermination(50000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        service.shutdown();
    }
}

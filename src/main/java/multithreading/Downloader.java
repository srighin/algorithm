package multithreading;

import java.util.concurrent.Semaphore;

public enum Downloader {

    INSTANCE;
    Semaphore resources = new Semaphore(3, true);

    public void download(){
        try {
            resources.acquire();
            downloadFromWeb();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            resources.release();
        }
    }

    private void downloadFromWeb() {
        System.out.println("Downloading resource from web");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

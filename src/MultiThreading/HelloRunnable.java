package MultiThreading;

import java.util.concurrent.TimeUnit;

public class HelloRunnable implements Runnable {

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        String helloMsg = String.format("Hello, i'm %s", threadName);
        System.out.println(helloMsg);
        try {
            TimeUnit.SECONDS.sleep(3);
        }
        catch (Throwable t) {
            t.printStackTrace();
        }
    }
}

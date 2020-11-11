package MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecTest {
    public static void main(String[] args) {
        Executors.newCachedThreadPool();
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Runnable task = () -> {
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
                System.out.println("Hello!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        };
        executor.submit(task);
        executor.submit(task);
    }
}

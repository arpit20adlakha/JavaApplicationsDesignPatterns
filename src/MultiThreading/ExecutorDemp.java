package MultiThreading;

import java.time.LocalTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorDemp {
    private final static int POOL_SIZE = 4;
    private final static int NUMBER_OF_TASKS = 10;

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(POOL_SIZE);
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService = Executors.newCachedThreadPool();

        ScheduledExecutorService ex = Executors.newSingleThreadScheduledExecutor();

        ex.scheduleAtFixedRate(() -> System.out.println(LocalTime.now() + ": Hello!"), 1000, 1000, TimeUnit.MILLISECONDS);
        try {
           Thread.sleep(2000);
        } catch (Exception e) {
           e.printStackTrace();
        }
        int poolSize = Runtime.getRuntime().availableProcessors();

        System.out.println(poolSize);
        for (int i = 0; i < NUMBER_OF_TASKS; i++) {
            int taskNumber = i;
            executor.submit(() -> {
                String taskName = "task-" + taskNumber;
                String threadName = Thread.currentThread().getName();
                System.out.printf("%s executes %s\n", threadName, taskName);
            });
        }
        executor.shutdown();
    }
}

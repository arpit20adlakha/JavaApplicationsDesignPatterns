package MultiThreading;

import java.util.concurrent.*;

public class CallableTest {

    public static void main(String[] args) {
        Callable<Integer> generator = () -> {
            TimeUnit.SECONDS.sleep(5);
            return 7000;
        };

        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit( () -> {
            TimeUnit.SECONDS.sleep(5);
            return 70000;
        });

        System.out.println(future.isDone());

        try {
//            int result = future.get(2, TimeUnit.SECONDS);
            future.cancel(true);
            System.out.println(future.isCancelled());
            future.get();
            System.out.println("the result is");
        } catch (ExecutionException | InterruptedException | CancellationException e) {
            System.out.println(e.getClass());
            System.out.println("the problem is execution or interruption");
        }
        executor.shutdown();
        System.out.println(future.isDone());
    }

}

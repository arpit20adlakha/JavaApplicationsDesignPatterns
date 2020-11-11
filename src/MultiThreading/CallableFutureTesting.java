package MultiThreading;

import java.util.concurrent.*;

public class CallableFutureTesting {


//    Runnable r = () -> {
//        System.out.println("I am a runnable");
//    };
//
//    Callable c = () -> {
//        System.out.println("I am a callable");
//        return 300;
//    };
public static void main(String[] args) {
    ExecutorService executor = Executors.newFixedThreadPool(4);
    Future<Integer> future1 = executor.submit(() -> {
        TimeUnit.SECONDS.sleep(5);
        return 700000;
    });

    Future<Integer> future2 = executor.submit(() -> {
        TimeUnit.SECONDS.sleep(5);
        return 900000;
    });

    try {
        int result = future1.get() + future2.get();
        System.out.println(result);
        executor.shutdown();
    } catch (InterruptedException | ExecutionException  e) {
        System.out.println(e.getClass());
        System.out.println(e.getStackTrace());
    }
}

}

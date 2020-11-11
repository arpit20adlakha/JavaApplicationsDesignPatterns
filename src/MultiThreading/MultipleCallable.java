package MultiThreading;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallable {
    public static void main(String[] args) {
        Runtime.getRuntime().availableProcessors();
        ExecutorService executor = Executors.newFixedThreadPool(4);
        List<Callable<Integer>> callables = List.of(() -> 1000, () -> 2000, () -> 1500);
        Callable[] callables1 = callables.stream().toArray(Callable[]:: new);
        try {
            callables1[0].call();
        } catch (Exception e) {
            // Callable Exception
        }
        try {
            List<Future<Integer>> futures = executor.invokeAll(callables);
            int sum = 0;
            for (Future<Integer> future : futures) {
                sum += future.get();
            }
            System.out.println(sum);
            executor.shutdown();
        } catch (Exception e) {

        }
    }
}

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyCallable {
 public static class MyCall implements Callable<Integer> {

     @Override
     public Integer call() throws Exception {
         Thread.sleep(1000);
         return 1;
     }

 }

 public static void main(String[] args) throws Exception {
     ExecutorService executorService = Executors.newSingleThreadExecutor();
     Future<Integer> f = executorService.submit( new MyCall());
     System.out.println(f.isDone());
     System.out.println(f.get());
 }

}

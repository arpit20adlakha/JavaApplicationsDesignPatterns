package MultiThreading;


import java.util.concurrent.TimeUnit;

public class ThreadTester {
    public static void main(String[] args) {
        System.out.println("Started");
        try {
//            Thread.sleep(2000L);
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Finished");

        Thread t1 = new HelloThread();
        t1.start();
        Thread t2 = new Thread(new HelloRunnable());
        t2.start();
        System.out.println("Finished");





//
//        Thread myThread = new Thread(new HelloRunnable(), "my-thread");
//
//        Thread t3 = new Thread(() -> {
//            System.out.println(String.format("Hello, i'm %s", Thread.currentThread().getName()));
//        });
    }
}

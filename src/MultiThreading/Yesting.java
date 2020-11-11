package MultiThreading;

public class Yesting {
    public static void main(String[] args) throws InterruptedException {
        Thread counter = new Thread(new CountingTask());
        System.out.println(counter.getState());
        counter.start();
        Thread.sleep(5000L);
        counter.interrupt();
        counter.join();

        CustomThread t1 = new CustomThread();
        t1.start();
        t1.interrupt();
        System.out.println(Thread.currentThread().getState());
        t1.join();
        System.out.println(Thread.currentThread().getState());

    }
}
// new
// runnable
// blocked
// waiting
// timed waiting

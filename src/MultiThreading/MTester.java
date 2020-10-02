package MultiThreading;

public class MTester {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        MyThread thread1 = new MyThread(counter);
        MyThread thread2 = new MyThread(counter);

        thread1.start();

        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(counter.getValue());
    }

}

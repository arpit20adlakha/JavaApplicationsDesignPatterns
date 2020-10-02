package MultiThreading;

public class Application1 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Worker1("Hello from t1");
        Thread t2 = new Worker1("Hello from t2");
        Thread t3 = new Worker1("Hello from t3");

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();
    }
}

package MultiThreading;

import java.time.LocalDateTime;

public class TestingJoin {
    private static Thread t1 = new Thread(new HelloRunnable(), "Jointester");
    public static void main(String[] args) {
        t1.start();
        System.out.println("Do something useful");
        try {
            System.out.println(LocalDateTime.now());
            t1.join();
            System.out.println(LocalDateTime.now());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Do something else");
    }
}

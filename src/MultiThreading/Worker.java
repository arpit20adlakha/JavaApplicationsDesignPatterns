package MultiThreading;

import java.util.concurrent.ExecutionException;

public class Worker extends Thread {

    @Override
    public void run() {
        try {
            System.out.println("Starting a task");
            Thread.sleep(2000);
        } catch (Exception e) {

        }
    }
}

package MultiThreading;

public class CountingTask implements Runnable {

    @Override
    public void run() {
        System.out.println("Start counting");
        int i = 1;

        try {
            while(!Thread.interrupted()) {
                System.out.println(i);
                i++;
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Sleeping was interrupted");
        }
        System.out.println("Finishing");
    }
}

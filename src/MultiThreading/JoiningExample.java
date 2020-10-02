package MultiThreading;

public class JoiningExample {
    public static void main(String[] args) throws InterruptedException {
        Thread worker = new Worker();
        worker.start();
        Thread.sleep(100L);
        System.out.println("Do something useful");
        worker.join(3000L);
        System.out.println("The program stopped");

    }
}

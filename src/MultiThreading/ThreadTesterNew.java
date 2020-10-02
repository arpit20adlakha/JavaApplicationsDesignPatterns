package MultiThreading;

public class ThreadTesterNew {
    public static void main(String[] args) {
        Thread worker = new SquareWorkerThread("square-worker");
        worker.start();
        String s = "arpIt";
        if (!s.equals(s.toUpperCase())) {}

        for (long i=0; i < 5_555_555_543L; i++) {
            if (i % 1_000_000_000 == 0) {
                System.out.println("Hello from main!");
            }
        }

    }
}

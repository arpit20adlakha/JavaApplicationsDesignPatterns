package MultiThreading;

public class Worker1 extends Thread {
    private final String str;

    public Worker1(String str) {
        this.str = str;
    }

    @Override
    public void run() {
        System.out.println(str);
    }
}

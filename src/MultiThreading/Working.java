package MultiThreading;

public class Working extends Thread {
    private final CovdClass c;

    Working (CovdClass c) {
        this.c = c;
    }

    @Override
    public void run() {
        c.method1();
        c.method2();
        c.method3();
    }
}

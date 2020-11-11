package MultiThreading;

import com.company.SyncCounter;

public class SynchronizedBlocks {
    private int numberOfCallingMethod1 = 0;
    private int numberOfCallingMethod2 = 0;

    final Object lock1 = new Object();
    final Object lock2 = new Object();

    public void method1() {
        System.out.println("method1...");

        synchronized (lock1) {
            numberOfCallingMethod1++;
        }
    }

    public void method2() {
        System.out.println("method2...");

        synchronized (lock2) {
            numberOfCallingMethod2++;
        }
    }


}

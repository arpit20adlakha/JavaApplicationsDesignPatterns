package MultiThreading;

import java.util.concurrent.SynchronousQueue;

public class SyncTester extends Thread{
    SomeClass s;

    public SyncTester(SomeClass s) {
        this.s = s;
    }

    @Override
    public void run() {
        try {
            s.someMethod();
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }
}

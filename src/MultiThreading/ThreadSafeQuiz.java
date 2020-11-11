package MultiThreading;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

public class ThreadSafeQuiz {
    public static void main(String[] args) throws InterruptedException{
        Queue<Integer> a = new ArrayDeque<>();

//        ThreadSafe1 t = new ThreadSafe1();
//        Thread thread = new Thread(t);
//        thread.start();
//        TimeUnit.MILLISECONDS.sleep(5);
//        t.cancel();
//
//        MyClass c = new MyClass();
//        Thread t1 = new T1(c);
//        Thread t2 = new T2(c);
//        t1.start();
//        t2.start();

        SomeClass s1 = new SomeClass("instance-1");
        SomeClass s2 = new SomeClass("instance-2");

        SyncTester sync1 = new SyncTester(s1);
        SyncTester sync2 = new SyncTester(s1);
        SyncTester sync3 = new SyncTester(s2);
        sync1.start();
        sync2.start();
        sync3.start();
    }

    private static class ThreadSafe1 implements Runnable {
        private boolean done;

        @Override
        public void run() {
            while(!done) {
                System.out.println("Running");
            }

            System.out.println("Done");
        }

        public void cancel() {
            this.done = true;
        }
    }
}

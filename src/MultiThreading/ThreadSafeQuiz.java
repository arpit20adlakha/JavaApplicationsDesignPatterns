package MultiThreading;

import java.util.concurrent.TimeUnit;

public class ThreadSafeQuiz {
    public static void main(String[] args) throws InterruptedException{
        ThreadSafe1 t = new ThreadSafe1();
        Thread thread = new Thread(t);
        thread.start();
        TimeUnit.MILLISECONDS.sleep(5);
        t.cancel();


        MyClass c = new MyClass();
        Thread t1 = new T1(c);
        Thread t2 = new T2(c);
        t1.start();
        t2.start();

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

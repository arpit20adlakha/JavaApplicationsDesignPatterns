package MultiThreading;

import static MultiThreading.ThreadColor.ANSI_GREEN;
import static MultiThreading.ThreadColor.ANSI_PURPLE;

public class SimpleTester {

    public static void main(String[] args) {

        System.out.println(ANSI_PURPLE + "Hello from main thread");
        ActiveThread thread = new ActiveThread();
        Thread threa1d = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Just frint");
            }
        });

        new Thread() {
            public void run() {
                System.out.println(ANSI_GREEN + "Hello from anonymous class thread");
            }
        }.start();

        threa1d.start();

        thread.start();

//        try {
//            thread.join();
//        } catch (InterruptedException e) {
//            System.out.println("Do nothing");
//        }

        System.out.println(ANSI_PURPLE + "This is from main thread");
    }

}

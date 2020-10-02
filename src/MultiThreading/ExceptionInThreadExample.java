package MultiThreading;

import java.beans.Customizer;

public class ExceptionInThreadExample {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new CustomThread("Arpit's thread");
        thread.start();
        thread.join();
        System.out.println("I am printed");
    }

    static class CustomThread extends Thread {

        public CustomThread(String name) {
            super(name);
        }

        @Override
        public void run() {
            System.out.println(2/0);
        }
    }
}

package MultiThreading;

public class CovdClass {

    public synchronized void method1() {
        System.out.println("I am inside method 1");
        for (int i=0; i< 100_000; i++) {
            System.out.print("N");
        }
    }

    public synchronized void method2() {
        System.out.println("I am inside method 2");
    }

    public void method3() {
        synchronized (this) {
            System.out.println("I am inside method 3");
        }
    }
}

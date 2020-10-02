package MultiThreading;

public class SomeClass {

    public static  void doSomething() {
        String threadName = Thread.currentThread().getName();
        System.out.println(String.format("%s entered the method", threadName));
        System.out.println(String.format("%s leaves the method", threadName));
    }
}

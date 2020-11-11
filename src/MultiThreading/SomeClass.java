package MultiThreading;

public class SomeClass {
    private String name;

    public SomeClass(String name) {
        this.name = name;
    }

    public static synchronized void doSomething() {
        String threadName = Thread.currentThread().getName();
        System.out.println(String.format("%s entered the method", threadName));
        System.out.println(String.format("%s leaves the method", threadName));
    }

    public synchronized void someMethod() throws InterruptedException {
        String threadName = Thread.currentThread().getName();
        System.out.println(String.format("%s entered the method of %s", threadName, name));
        Thread.sleep(1000);
        System.out.println(String.format("%s leaves the method of %s", threadName, name));
    }

}

package ThreadSafetryInSingleton;

public class Tester {

    public static void main(String[] args) {
        Thread t1 = new Thread(new Threading());
        Thread t2 = new Thread(new Threading());
        t1.start();
        t2.start();
    }
}

package ThreadSafetryInSingleton;

public class Threading extends Thread {


    @Override
    public void run() {
        Single s1 = Single.getInstance();
        System.out.println(s1);
        s1.printSomething();
    }
}

package MultiThreading;

public class T1 extends Thread {
    MyClass a ;

    T1(MyClass m) {
        this.a = m;
    }

    @Override
    public void run() {
        a.setNumber(10);
        SomeClass.doSomething();
    }
}

package MultiThreading;

public class T2 extends Thread {
    MyClass c;

    T2(MyClass c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(c.getNumber());
        SomeClass.doSomething();
    }

}

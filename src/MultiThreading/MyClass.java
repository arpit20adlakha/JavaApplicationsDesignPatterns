package MultiThreading;

public class MyClass extends Thread {
    private long number = 5;

    public void setNumber(long number) {
        this.number = number;
    }

    public long getNumber() {
        return number;
    }
}



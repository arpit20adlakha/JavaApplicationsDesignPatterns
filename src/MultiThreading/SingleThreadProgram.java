package MultiThreading;

public class SingleThreadProgram {
    public static void main(String[] args) {

        Thread t1 = new HelloThread();
        t1.start();
        System.out.println(2/0);
    }
}

package MultiThreading;

public class tester {
    public static void main(String[] args) {
        CovdClass c = new CovdClass();
        Working w1 = new Working(c);
        Working w2 = new Working(c);
        w1.start();
        w2.start();
    }
}

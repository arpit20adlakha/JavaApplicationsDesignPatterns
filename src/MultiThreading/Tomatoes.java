package MultiThreading;

public class Tomatoes extends Thread {

    @Override
    public void run() {
        for (int i =3 ; i>=1 ; i--) {
            System.out.println("slice tomatoes" + i);
        }
    }
}

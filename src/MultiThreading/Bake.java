package MultiThreading;

public class Bake extends Thread {
    @Override
    public void run() {
        for(int i=4; i >= 0; i--) {
            if (i == 0) {
                System.out.println("Your pizza is ready!");
                break;
            }
            System.out.println("to bake..." + i + "min");
        }
    }
}

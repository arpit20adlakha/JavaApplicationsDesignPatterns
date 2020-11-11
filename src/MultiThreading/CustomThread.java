package MultiThreading;

public class CustomThread extends Thread {

    @Override
    public void run() {
        while(!isInterrupted()) {
            try {
                doAction();
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                System.out.println("sleeping was interrupted");
                break;
            }
        }
        System.out.printf("%s finished", getName());
    }

    private void doAction() {
        System.out.println("The system is such a problem");
    }
}

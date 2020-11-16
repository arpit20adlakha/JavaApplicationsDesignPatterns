package MultiThreading;

import static MultiThreading.ThreadColor.ANSI_BLUE;

public class ActiveThread extends Thread {

    @Override
    public void run() {
        System.out.println(ANSI_BLUE + "Started this new thread");
    }
}

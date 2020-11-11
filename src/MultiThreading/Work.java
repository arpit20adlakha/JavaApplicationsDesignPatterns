package MultiThreading;

import com.company.SyncCounter;

public class Work extends Thread {

    private final SyncCounter counter;

    public Work(SyncCounter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10_000_000; i++) {
            counter.increment();
        }
    }
}

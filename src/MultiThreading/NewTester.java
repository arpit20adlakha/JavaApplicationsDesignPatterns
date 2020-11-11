package MultiThreading;

import com.company.SyncCounter;

public class NewTester {
    public static void main(String[] args) throws Exception {
        SyncCounter counter = new SyncCounter();

        Work work1 = new Work(counter);
        Work work2 = new Work(counter);

        work1.start();
        work2.start();

        work1.join();
        work2.join();

        System.out.println(counter.getValue());
    }
}

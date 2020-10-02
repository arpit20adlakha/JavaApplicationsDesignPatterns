package MultiThreading;

import java.util.Arrays;
import java.util.Scanner;

public class TestMain {
    private static long mainThreadId = Thread.currentThread().getId();

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        SlowStringProcessor processor = new SlowStringProcessor(str);
        processor.start();
        processor.join();
        System.out.println(processor.getNumberOfUniqueCharacters());
    }

    static class SlowStringProcessor extends Thread {
        private final String s;
        private volatile long numberOfUniqueCharacters = 0;

        public SlowStringProcessor(String s) {
            this.s = s;
        }


        @Override
        public void run() {
            final long currentId = Thread.currentThread().getId();

            if (currentId == mainThreadId) {
                throw new RuntimeException("You must start a new thread!");
            }
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                throw new RuntimeException("Do not interrupt the processor");
            }

            this.numberOfUniqueCharacters = Arrays.stream(s.split("")).distinct().count();
        }

        public long getNumberOfUniqueCharacters() {
            return numberOfUniqueCharacters;
        }
    }
}

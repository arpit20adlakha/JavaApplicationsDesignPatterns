package MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class AsyncMessageSenderImpl implements AsyncMessageSender {
    private ExecutorService executorService = Executors.newCachedThreadPool();
    private final int repeatFactor;

    public AsyncMessageSenderImpl(int repeatFactor) {
        this.repeatFactor = repeatFactor;
    }

    @Override
    public void sendMessages(Message[] messages) {
        for(Message message : messages) {
            for (int i = 0; i < repeatFactor; i++) {
                executorService.submit(() -> {
                    System.out.printf("(%s>%s): %s\n", message.from, message.to, message.text);
                });
            }
        }
    }

    @Override
    public void stop() {
        executorService.shutdown();
        try {
            executorService.awaitTermination(1000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

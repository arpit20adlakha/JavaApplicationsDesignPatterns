package MultiThreading;

import java.util.concurrent.Executors;

public class PetaYest {

    public static void main(String[] args) {
        AsyncMessageSender sender = new AsyncMessageSenderImpl(3);
        Message[] messages = {
                new Message("John", "Mary", "Hello!"),
                new Message("Clara", "Bruce", "How are you today?")
        };
        Runtime.getRuntime().availableProcessors();
        sender.sendMessages(messages);
        sender.stop();
    }
}

package MultiThreading;

public interface AsyncMessageSender {
    void sendMessages(Message[] messages);
    void stop();
}

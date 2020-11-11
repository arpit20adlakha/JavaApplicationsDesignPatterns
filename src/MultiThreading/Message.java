package MultiThreading;

public class Message {
    final String text;
    final String from;
    final String to;

    Message(String from, String to, String text) {
        this.text = text;
        this.to = to;
        this.from = from;
    }
}

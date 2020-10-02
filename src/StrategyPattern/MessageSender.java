package StrategyPattern;

public class MessageSender {
    private SendingMethod method;

    public void setMethod(SendingMethod method) {
        this.method = method;
    }

    public void send(String from, String to, String msg) {
        this.method.send(from , to ,msg);
    }
}

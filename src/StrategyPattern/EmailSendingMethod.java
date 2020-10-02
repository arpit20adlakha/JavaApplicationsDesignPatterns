package StrategyPattern;

public class EmailSendingMethod implements SendingMethod {

    @Override
    public void send(String from, String to, String msg) {
        System.out.println(String.format("Email from %s to %s", from , to));
    }
}

package StrategyPattern;

public class SmsSendingMethod implements SendingMethod {
    @Override
    public void send(String from , String to, String msg) {
        System.out.println(String.format("sends sms from %s to %s", from, to));
    }
}

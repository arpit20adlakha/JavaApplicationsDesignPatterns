package StrategyPattern;

public class PushMethodNew implements SendingMethodNew {

    @Override
    public void send(Message message) {
        System.out.println(message);
    }
}

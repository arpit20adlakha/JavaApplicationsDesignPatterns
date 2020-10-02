package StrategyPattern;

public class PushSendingMethod implements SendingMethod {
    private final boolean magicFlag;

    public PushSendingMethod(boolean magicFlag) {
        this.magicFlag = magicFlag;
    }

    @Override
    public void send(String from, String to, String msg) {
        System.out.println(String.format("Send push from %s to %s", from, to));
    }
}

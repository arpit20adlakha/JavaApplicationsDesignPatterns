package StrategyPattern;

public class TestingClass {

    public static void main(String[] args) {
        MessageSender sender = new MessageSender();
        sender.setMethod(new EmailSendingMethod());
        // Sending email
        sender.send("arpit@gmail.com", "bob@gmal.com", "Hello!!");

        // Sending sms
        sender.setMethod(new SmsSendingMethod());
        sender.send("32323242794", "2434343434", "Hoolla!!");
    }
}

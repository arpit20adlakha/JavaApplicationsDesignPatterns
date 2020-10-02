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

        sender.setMethod(new PushSendingMethod(true));
        sender.send("343434", "43434", "hupla");


        Message message = new Message("aadlakha", "peeps", "How are you?", "Just wanted to know your well being hence this question");
        System.out.println(message);
        SendingMethodNew sendingMethodNew = new PushMethodNew();
        sendingMethodNew.send(message);

    }
}

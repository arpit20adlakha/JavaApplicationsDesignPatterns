package dependecyInjection;

public class MyApplicationAnotherImpl {

    private EmailService email = null;

            public MyApplicationAnotherImpl(EmailService emailService) {
                this.email = emailService;
            }

            public void processMessages(String message, String receiver) {
                this.email.sendEmail(message, receiver);
            }
}

package dependecyInjection;

public class MyApplication {
    private EmailService email = new EmailService();

    public void processMessage(String message, String rec) {
        this.email.sendEmail(message, rec);
    }
}

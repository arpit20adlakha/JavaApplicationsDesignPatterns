package dependecyInjection;

import dependecyInjection.consumer.Consumer;
import dependecyInjection.injector.EmailServiceInjector;
import dependecyInjection.injector.MessageServiceInjector;
import dependecyInjection.injector.SMSServiceInjector;

public class MyMessageDITest {

    public static void main(String[] args) {
        String msg = "Hi Arpit";
        String email = "aadlakha@groupon.com";
        String phone = "8295698984";
        MessageServiceInjector injector = null;
        Consumer app = null;

        // Send email
        injector = new EmailServiceInjector();
        app = injector.getConsumer();
        app.processMessages(msg, email);

        // Send SMS
        injector = new SMSServiceInjector();
        app = injector.getConsumer();
        app.processMessages(msg, email);
    }
}

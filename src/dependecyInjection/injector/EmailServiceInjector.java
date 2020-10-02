package dependecyInjection.injector;

import dependecyInjection.consumer.Consumer;
import dependecyInjection.consumer.MyDIApplication;
import dependecyInjection.service.EmailServiceImpl;

public class EmailServiceInjector implements MessageServiceInjector {

    @Override
    public Consumer getConsumer() {
        return new MyDIApplication(new EmailServiceImpl());
    }
}

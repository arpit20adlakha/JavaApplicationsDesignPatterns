package dependecyInjection.injector;


import dependecyInjection.consumer.Consumer;
import dependecyInjection.consumer.MyDIApplication;
import dependecyInjection.service.SMSServiceImpl;

public class SMSServiceInjector implements  MessageServiceInjector {

    @Override
    public Consumer getConsumer() {
        return new MyDIApplication(new SMSServiceImpl());
    }
}

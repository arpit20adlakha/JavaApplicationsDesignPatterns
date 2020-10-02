package dependecyInjection.test;

import dependecyInjection.consumer.Consumer;
import dependecyInjection.consumer.MyDIApplication;
import dependecyInjection.injector.MessageServiceInjector;
import dependecyInjection.service.MessageService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyDIApplicationJunitTest {
    private MessageServiceInjector injector;

    @Before
    public void setUp() {
        injector = new MessageServiceInjector() {
            @Override
            public Consumer getConsumer() {
                return new MyDIApplication(new MessageService() {
                    @Override
                    public void sendMessage(String msg, String rec) {
                        System.out.println("Mock Message Service Implementation");
                    }
                });
            }
        };
    }


    @Test
    public void test() {
        Consumer consumer = injector.getConsumer();
        consumer.processMessages("Hi Pankaj", "pankaj@abc.com");
    }

    @After
    public void tearDown() {
        injector = null;
    }
}

package dependecyInjection.consumer;

import dependecyInjection.service.MessageService;

public class MyDIApplication implements Consumer {
    private MessageService service;

    public MyDIApplication(MessageService svc) {
        this.service = svc;
    }

    @Override
    public void processMessages(String msg, String rec) {
        msg += "tampered";
        this.service.sendMessage(msg, rec);
    }
}

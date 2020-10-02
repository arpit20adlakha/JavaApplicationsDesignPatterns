package dependecyInjection.consumer;

import dependecyInjection.service.MessageService;

public class MyDIApplicationUsingSetter implements Consumer{
    MessageService messageService;

    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }
    @Override
    public void processMessages(String msg, String rec){
        msg += " Processed by the application";
        this.messageService.sendMessage(msg, rec);
    }
}

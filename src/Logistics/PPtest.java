package Logistics;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PPtest {

    public static void main() {
        User usr = new User();
        usr.setUserId(1);
        usr.setName("Shashi");
        usr.setEmailId("shashi@gmail.com");

        Item item1 = new Item();
        item1.setName("item1");
        item1.setPrice(40);

        List<Item> items = new ArrayList<>();
        items.add(item1);

        PaymentDetails paymentDetails = new PaymentDetails();
        paymentDetails.setAmount(100);
        paymentDetails.setPaymentmode(PaymentMode.CREDIT_CARD);
        paymentDetails.setCardNumber("2113323");

        Location destination = new Location();
        destination.setLatitude(73.23);
        destination.setLongitude(132.32);

        Order order = new Order();
        order.setOrderId(1);
        order.setItems(items);
        order.setOrderStatus(OrderStatus.PROCESSING);
        order.setDestination(destination);
        order.setPaymentDetails(paymentDetails);
        order.setTimeOfOrderDelivery(new Date());

        LogisticsService logisticsService = new LogisticsService();
        logisticsService.registerNewUser(usr);
        logisticsService.takeAnOrder(order);
        logisticsService.processOrder(order);

    }



}

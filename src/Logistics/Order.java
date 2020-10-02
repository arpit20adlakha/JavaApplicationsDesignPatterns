package Logistics;

import java.util.Date;
import java.util.List;

public class Order {
    private int orderId;
    private OrderPriority orderPriority;
    private User sender;
    private PaymentDetails paymentDetails;
    private Location destination;
    private List<Item> items;
    private Long totalWeight;
    private OrderStatus orderStatus;
    private Date timeOfOrderPlaced;
    private Date timeOfOrderDelivery;
    private Vehicle vehicleOfThisOrder;

    public OrderPriority getOrderPriority() {
        return orderPriority;
    }

    public void setOrderPriority(OrderPriority orderPriority) {
        this.orderPriority = orderPriority;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public PaymentDetails getPaymentDetails() {
        return paymentDetails;
    }

    public void setPaymentDetails(PaymentDetails paymentDetails) {
        this.paymentDetails = paymentDetails;
    }

    public Location getDestination() {
        return destination;
    }

    public void setDestination(Location destination) {
        this.destination = destination;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Long getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(Long totalWeight) {
        this.totalWeight = totalWeight;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Date getTimeOfOrderPlaced() {
        return timeOfOrderPlaced;
    }

    public void setTimeOfOrderPlaced(Date timeOfOrderPlaced) {
        this.timeOfOrderPlaced = timeOfOrderPlaced;
    }

    public Date getTimeOfOrderDelivery() {
        return timeOfOrderDelivery;
    }

    public void setTimeOfOrderDelivery(Date timeOfOrderDelivery) {
        this.timeOfOrderDelivery = timeOfOrderDelivery;
    }

    public Vehicle getVehicleOfThisOrder() {
        return vehicleOfThisOrder;
    }

    public void setVehicleOfThisOrder(Vehicle vehicleOfThisOrder) {
        this.vehicleOfThisOrder = vehicleOfThisOrder;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
}

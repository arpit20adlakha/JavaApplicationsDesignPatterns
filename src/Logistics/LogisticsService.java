package Logistics;

import java.util.ArrayList;
import java.util.List;

public class LogisticsService {
    List<Order> orders;
    private List<Vehicle> vehicles;
    private List<User> users;

    public LogisticsService() {
        this.orders = new ArrayList<>();
        this.vehicles = new ArrayList<>();
        this.users = new ArrayList<>();
    }


    public void takeAnOrder(Order order) {
        System.out.println("Adding an order");
        orders.add(order);
    }

    public void processOrder(Order order) {
        System.out.println("Processing an order of the system");
    }

    public Location trackOrder(int orderId) {
        System.out.println("Tracking an order of the system");
        Location location = null;
        return location;
    }

    public void cancelOrder(Order order) {
        System.out.println("Going to cancel and order of the system");
    }

    public void registerNewUser(User user) {
        System.out.println("Registering the new user");
        users.add(user);
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles)
    {
        this.vehicles = vehicles;
    }

    public List<User> getUsers()
    {
        return users;
    }

    public void setUsers(List<User> users)
    {
        this.users = users;
    }


}

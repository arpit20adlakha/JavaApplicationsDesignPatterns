package AdvancedJavaAndGenerics;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Store {
    public static void main(String[] args) {
        Queue<Customer> queue = new LinkedList<>();
        queue.add(new Customer("Sally"));
        queue.add(new Customer("Ben"));
        queue.add(new Customer("Emma"));
        queue.add(new Customer("Fred"));
        System.out.println(queue);
        serveCustomer(queue);
        System.out.println(queue);
    }

    static void serveCustomer(Queue<Customer> queue) {
        Customer c = queue.poll();
        c.serve();
    }
}

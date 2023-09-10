package BehavioralPatterns.CommandPattern;

import java.util.ArrayList;
import java.util.List;

public class Broker {

    List<Order> orders = new ArrayList<>();

    public void takeOrders() {
        for (Order order : orders) {
            order.execute();
        }
        orders.clear();
    }

    public void placeOrders(Order order) {
        orders.add(order);
    }
}

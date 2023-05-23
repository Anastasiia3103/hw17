package coffee.order;

import java.util.ArrayList;
import java.util.List;

public class CoffeeOrderBoard {
    private List<Order> orders;
    public CoffeeOrderBoard() {
        orders = new ArrayList<> ();
    }
    public void add (Order order) {
        int orderNumber = orders.size() + 1;
        order.setOrderNumber(orderNumber);
        orders.add(order);
    }
    public void deliver() {
        if (orders.isEmpty ()) {
            System.out.println ("No orders.");
            return;
        }
        Order nextOrder = orders.get (0);
        System.out.println ("Delivering order: " + nextOrder.getOrderNumber() + " | " + nextOrder.getName());
        orders.remove (0);
    }
    public void deliver(int orderNumber) {
        for (int i = 0; i < orders.size (); i++) {
            Order order = orders.get (i);
            if (order.getOrderNumber() == orderNumber) {
                System.out.println ("Delivering order: " + order.getOrderNumber() + " | " + order.getName());
                orders.remove (i);
                return;
            }
        }
        System.out.println ("Order number " + orderNumber + " not found");
    }
    public void draw() {
        System.out.println ("============= ");
        System.out.println ("Num | Name");
        for (Order order : orders) {
            System.out.println (order.getOrderNumber() + " | " + order.getName());
        }
    }
}



package org.example.module2_object_orientation.c09_recap_project;

import java.util.ArrayList;
import java.util.Objects;

public class OrderListRepo {
    private ArrayList<Order> orders;

    // Constructor

    public OrderListRepo() {
        orders = new ArrayList<>();
    }

    // Getter & Setter

    public ArrayList<Order> getOrders() {
        return orders;
    }

    // equals & hashCode

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        OrderListRepo that = (OrderListRepo) o;
        return Objects.equals(orders, that.orders);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(orders);
    }

    // toString

    @Override
    public String toString() {
        return "OrderListRepo{" +
                "orders=" + orders +
                '}';
    }

    // custom methods

    public void add(Order order) {
        orders.add(order);
    }

    public void remove(long id) {
        orders.remove(get(id));
    }

    public Order get(long id) {
        for (Order order : orders) {
            if (order.id() == id){
                return order;
            }
        }
        return null;
    }




}

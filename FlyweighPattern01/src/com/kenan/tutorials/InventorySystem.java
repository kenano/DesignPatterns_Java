package com.kenan.tutorials;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by kenanozdamar on 5/6/17.
 */
public class InventorySystem {
    private final Catalog catalog = new Catalog();

    // CopyOnWriteArrayList - A thread-safe variant of ArrayList in which all mutative operations (add, set, and so on)
    // are implemented by making a fresh copy of the underlying array.
    private final List<Order> orders = new CopyOnWriteArrayList<>();

    void takeOrder(String itemName, int orderNumber){
        Item item = catalog.lookup(itemName);
        Order order = new Order(orderNumber, item);
        orders.add(order);
    }

    void process(){
        for (Order order: orders){
            order.processOrder();
            orders.remove(order);
        }
    }

    String report() {
        return "\nTotal Item objects made: "
                + catalog.totalItemsMade();
    }
}

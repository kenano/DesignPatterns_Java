package com.kenan.tutorials;

/**
 * Created by kenanozdamar on 5/6/17.
 */
public class Order {

    private final Item item;
    private final int orderNumber;

    public Order(int orderNumber, Item item) {
        this.item = item;
        this.orderNumber = orderNumber;
    }

    void processOrder(){
        System.out.println("Ordering " + item + " for order number " + orderNumber);
    }
}

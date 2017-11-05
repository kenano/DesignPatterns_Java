package com.kenan.tutorials;

/**
 * This project doesnt use Visitor Pattern to demonstrate why it should be used.
 * There is a associated project which shows how this example would use it.
 */
public class VisitorDemo {

    public static void main(String[] args) {
        PartsOrder partsOrder = new PartsOrder();
        partsOrder.addAtvPart(new Oil());
        partsOrder.addAtvPart(new Fender());
        partsOrder.addAtvPart(new Wheel());

        partsOrder.calculateShipping();
    }
}

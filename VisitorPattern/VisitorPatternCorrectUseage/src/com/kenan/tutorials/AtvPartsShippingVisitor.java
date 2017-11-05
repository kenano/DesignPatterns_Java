package com.kenan.tutorials;

import java.util.List;

/**
 * Created by kenanozdamar on 5/28/17.
 */
public class AtvPartsShippingVisitor implements AtvPartVisitor {

    double shippingAmount = 0;

    @Override
    public void visit(Wheel wheel) {
        shippingAmount += 15;
    }

    @Override
    public void visit(Fender fender) {
        shippingAmount += 3;
    }

    @Override
    public void visit(Oil oil) {
        shippingAmount += 5;
    }

    @Override
    public void visit(PartsOrder partsOrder) {
        System.out.println("If they bought more than 3 things we will give them a discount on shipping.");
        List<AtvPart> parts = partsOrder.getAtvParts();
        if(parts.size() > 3) {
            shippingAmount -= 5;
        }
        System.out.println("Shipping amount is: " + shippingAmount);
    }
}

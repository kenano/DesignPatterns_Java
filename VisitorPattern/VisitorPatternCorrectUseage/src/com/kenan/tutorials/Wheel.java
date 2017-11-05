package com.kenan.tutorials;

/**
 * Created by kenanozdamar on 5/28/17.
 */
public class Wheel implements AtvPart{
    @Override
    public void accept(AtvPartVisitor vistor) {
        vistor.visit(this);
    }
}

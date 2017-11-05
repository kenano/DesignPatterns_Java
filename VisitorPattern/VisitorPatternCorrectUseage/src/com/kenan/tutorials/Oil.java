package com.kenan.tutorials;

/**
 * Created by kenanozdamar on 5/28/17.
 */
public class Oil implements AtvPart{
    @Override
    public void accept(AtvPartVisitor vistor) {
        vistor.visit(this);
    }
}

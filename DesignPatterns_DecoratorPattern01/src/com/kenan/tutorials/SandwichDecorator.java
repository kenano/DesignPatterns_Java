package com.kenan.tutorials;

/**
 * Created by kenanozdamar on 5/2/17.
 */
public abstract class SandwichDecorator implements Sandwich {
    protected Sandwich customSandwich;

    public SandwichDecorator(Sandwich customSandwich) {
        this.customSandwich = customSandwich;
    }

    @Override
    public String make() {
        return customSandwich.make() ;
    }
}

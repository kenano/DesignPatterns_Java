package com.kenan.tutorials;

/**
 * Created by kenanozdamar on 5/2/17.
 */
public class MeatDecorator extends SandwichDecorator {

    public MeatDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    @Override
    public String make() {
        return super.make() + addMeat();
    }

    private String addMeat(){
        return " + Turkey ";
    }
}

package com.kenan.tutorials;

/**
 * Created by kenanozdamar on 5/2/17.
 */
public class DressingDecorator extends SandwichDecorator {

    public DressingDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    @Override
    public String make() {
        return super.make() + addDressing();
    }

    private String addDressing(){
        return "+ mustard";
    }
}

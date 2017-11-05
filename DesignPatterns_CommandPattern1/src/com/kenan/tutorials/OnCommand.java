package com.kenan.tutorials;

/**
 * Concrete command component of Command design pattern.
 */
public class OnCommand implements Command {

    private Light light;

    public OnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}

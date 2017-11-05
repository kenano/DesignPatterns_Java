package com.kenan.tutorials;

/**
 * Created by kenanozdamar on 5/9/17.
 */
//concrete command
public class OnCommand implements Command{

    private Light light;

    public OnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
//        light.on();
    }
}

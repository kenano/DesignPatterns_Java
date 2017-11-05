package com.kenan.tutorials;

/**
 * Created by kenanozdamar on 5/10/17.
 */
public class ToggleCommand implements Command {
    private Light light;

    public ToggleCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {

        light.toogle();

    }
}

package com.kenan.tutorials;

/**
 * Client component of Command Design Pattern
 */
public class CommandDemo {

    public static void main(String[] args) {
        //the receiver
        Light light = new Light();

        //the invoker
        Switch lightSwitch = new Switch();

        Command onCommand = new OnCommand(light);

        lightSwitch.storeAndExecute(onCommand);


    }
}

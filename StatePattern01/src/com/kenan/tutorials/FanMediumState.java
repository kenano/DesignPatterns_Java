package com.kenan.tutorials;

/**
 * Created by kenanozdamar on 5/16/17.
 */
public class FanMediumState extends State {

    private Fan fan;

    public FanMediumState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning fan on to high...");
        fan.setState(fan.getFanHighState());
    }

    public String toString() {
        return "Fan is on med.";
    }
}

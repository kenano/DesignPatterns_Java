package com.kenan.tutorials;

/**
 * Created by kenanozdamar on 5/16/17.
 */
public class FanLowState extends State {
    private Fan fan;

    public FanLowState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public String toString() {
        return "Fan is low";
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning fan on to medium.");
        fan.setState(fan.getFanMediumState());
    }
}

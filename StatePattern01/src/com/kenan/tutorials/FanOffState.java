package com.kenan.tutorials;

/**
 * Created by kenanozdamar on 5/16/17.
 */
public class FanOffState extends State{

    private Fan fan;

    public FanOffState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public String toString() {
        return "Fan is off";
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning fan on to low.");
        fan.setState(fan.getFanLowState());
    }
}

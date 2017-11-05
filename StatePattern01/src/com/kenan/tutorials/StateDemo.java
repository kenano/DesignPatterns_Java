package com.kenan.tutorials;

/**
 * Created by kenanozdamar on 5/16/17.
 */
public class StateDemo {
    public static void main(String[] args) {
        Fan fan = new Fan();

        System.out.println(fan);

        fan.pullChain();

        System.out.println(fan);

        fan.pullChain();

        System.out.println(fan);

        fan.pullChain();

        System.out.println(fan);

        fan.pullChain();

        System.out.println(fan);
    }
}

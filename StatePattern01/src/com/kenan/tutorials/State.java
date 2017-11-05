package com.kenan.tutorials;

/**
 * Created by kenanozdamar on 5/16/17.
 */
public abstract class State {

    public void handleRequest(){
        System.out.println("Error - this shouldn't execute");
    }
}

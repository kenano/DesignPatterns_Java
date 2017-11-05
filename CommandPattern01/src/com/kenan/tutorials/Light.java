package com.kenan.tutorials;

/**
 * Created by kenanozdamar on 5/9/17.
 */

//receiver
public class Light  {

    private boolean isOn = false;

    public void toogle(){
        if(isOn){
            off();
            isOn = false;
        }else {
            on();
            isOn = true;
        }
    }

    private void on(){
        System.out.println("Light is now on");
    }

    private void off(){
        System.out.println("Light is now off");
    }
}

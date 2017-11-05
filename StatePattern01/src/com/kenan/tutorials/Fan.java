package com.kenan.tutorials;

/**
 * Created by kenanozdamar on 5/16/17.
 */
public class Fan {

    State fanOffState;
    State fanLowState;
    State fanMediumState;
    State fanHighState;

    State state;

    public State getFanHighState() {
        return fanHighState;
    }

    public Fan() {
         fanOffState = new FanOffState(this);
         fanLowState = new FanLowState(this);
         fanMediumState = new FanMediumState(this);
         fanHighState = new FanHighState(this);

         state = fanOffState;
    }

    public State getFanOffState() {
        return fanOffState;
    }

    public State getFanLowState(){
        return fanLowState;
    }

    public State getFanMediumState() {
        return fanMediumState;
    }

    public void setState(State state){
        this.state = state;
    }

    public void pullChain(){
        state.handleRequest();
    }

    @Override
    public String toString() {
        return state.toString();
    }

}

package com.ahmedco.state;

public class Context_ {
    private State state;
    public Context_(){
        state = null;
    }
    public void setState(State state){
        this.state = state;
    }
    public State getState(){
        return state;
    }
}
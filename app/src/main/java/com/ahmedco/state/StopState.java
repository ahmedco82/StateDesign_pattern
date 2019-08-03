package com.ahmedco.state;

import android.content.Context;

public class StopState implements State {

    public void doAction(Context_ context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    public String toString(){
        return "Stop State";
    }
}
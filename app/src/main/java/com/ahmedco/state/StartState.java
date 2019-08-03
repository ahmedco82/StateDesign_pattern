package com.ahmedco.state;


public class StartState implements State {


    public void doAction(Context_ context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }


    public String toString(){

        return "Start State";
    }
}

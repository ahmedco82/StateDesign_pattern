package com.ahmedco.state;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    StartState state;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // a class (Context_) behavior changes based on its state
        Test1();
    }

    private void Test1(){
        //https://www.tutorialspoint.com/design_pattern/state_pattern
        Context_ context = new Context_();
        // new context is created .
        StartState startState = new StartState();
        startState.doAction(context);
        System.out.println(context.getState().toString());
        StopState stopState = new StopState();
        stopState.doAction(context);
        System.out.println(context.getState().toString());
        /*
        StartState startState = new StartState();
        startState.doAction(context);
        System.out.println("Print0_0:"+ context.getState());
        StopState stopState = new StopState();
        stopState.doAction(context);
        System.out.println("Print01: "+ context.getState().toString());
        */


    }

}




















































package com.tutorial.instrument;

/**
 * Created by kishore on 6/1/17.
 */
public class Lion {

    //To be instrumented java class
    public void runLoin() throws InterruptedException {
        System.out.println("Lion is going to run....");
        Thread.sleep(2000L);
    }
}

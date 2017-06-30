package com.css.instrument;

import java.lang.instrument.Instrumentation;

/**
 * Created by kishore on 6/1/17.
 */
public class DurationAgent {

    //For all loaded classes, premain will called
    public static void premain(String agentArgs, Instrumentation instrumentation) {
        System.out.println("Executing premain ......");
        instrumentation.addTransformer(new DurationTransformer());
    }
}

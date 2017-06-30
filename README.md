# InstrumentationDemo

DurationTransformer.java
    This is the Java class that will be registered with the Java instrumentation agent.
    This will modify the class’ bytecode by inserting new lines and the original class will be replaced by the classloader.

DurationAgent.java
    Which is the actual agent class, contains the premain method that invoked by jvm before the main method (before loading classes).

Lion.java



# Run Project
    mvn clean install
    cd target
    java -cp {HOME}/.m2/repository/org/javassist/javassist/3.19.0-GA/javassist-3.19.0-GA.jar -javaagent:./instrumentation.jar com.tutorial.instrument.TestInstrumentation

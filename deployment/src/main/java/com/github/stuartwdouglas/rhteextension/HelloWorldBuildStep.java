package com.github.stuartwdouglas.rhteextension;

import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.annotations.ExecutionTime;
import io.quarkus.deployment.annotations.Record;

public class HelloWorldBuildStep {

    @BuildStep
    @Record(ExecutionTime.RUNTIME_INIT)
    void sayHello(HelloWorldRecorder recorder) {
        System.out.println("About to say Hello");
        Person p = new Person("Stuart", "Douglas");
        recorder.sayHello(p);
    }
}

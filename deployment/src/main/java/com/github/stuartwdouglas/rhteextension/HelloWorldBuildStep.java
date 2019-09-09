package com.github.stuartwdouglas.rhteextension;

import java.util.function.Supplier;

import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.annotations.ExecutionTime;
import io.quarkus.deployment.annotations.Record;

public class HelloWorldBuildStep {

    @BuildStep
    @Record(ExecutionTime.RUNTIME_INIT)
    void sayHello(HelloWorldRecorder recorder) {
        System.out.println("About to say Hello");
        Supplier<String> supplier = recorder.getSupplier();

        for (int i = 0; i < 10; ++i) {
            recorder.sayHello(supplier);
        }
    }
}

package com.github.stuartwdouglas.rhteextension;

import java.util.function.Supplier;

import io.quarkus.runtime.annotations.Recorder;

@Recorder
public class HelloWorldRecorder {

    public Supplier<String> getSupplier() {
        return new Supplier<String>() {
            @Override
            public String get() {
                return System.nanoTime() % 2 == 0 ? "Daniel" : "Bob";
            }
        };
    }

    public void sayHello(Supplier<String> p) {
        System.out.println("Hello " + p.get());
    }

}

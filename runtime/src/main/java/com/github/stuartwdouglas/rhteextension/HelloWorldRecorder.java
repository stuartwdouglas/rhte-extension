package com.github.stuartwdouglas.rhteextension;

import io.quarkus.runtime.annotations.Recorder;

@Recorder
public class HelloWorldRecorder {

    public void sayHello(String name) {
        System.out.println("Hello " + name);
    }

}

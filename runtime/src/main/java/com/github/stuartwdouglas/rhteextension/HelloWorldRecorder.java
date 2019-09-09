package com.github.stuartwdouglas.rhteextension;

import io.quarkus.runtime.annotations.Recorder;

@Recorder
public class HelloWorldRecorder {

    public void sayHello(Person p) {
        System.out.println("Hello " + p.getFirst() + " " + p.getLast());
    }

}

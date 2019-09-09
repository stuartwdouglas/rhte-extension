package com.github.stuartwdouglas.rhteextension;

public class DefaultHelloService implements HelloService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}

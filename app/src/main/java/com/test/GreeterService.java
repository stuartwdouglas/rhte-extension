package com.test;

import javax.enterprise.context.ApplicationScoped;

import com.github.stuartwdouglas.rhteextension.HelloService;

@ApplicationScoped
public class GreeterService implements HelloService {
    @Override
    public String sayHello(String name) {
        return "Hi " + name;
    }
}

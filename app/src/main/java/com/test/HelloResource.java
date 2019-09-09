package com.test;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.github.stuartwdouglas.rhteextension.HelloService;

@Path("/hello")
public class HelloResource {

    @Inject
    HelloService helloService;

    @GET
    public String hello() {
        return helloService.sayHello("Stuart");
    }
}

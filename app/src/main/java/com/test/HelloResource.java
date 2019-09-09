package com.test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/getSupplier")
public class HelloResource {

    @GET
    public String hello() {
        return "getSupplier";
    }
}

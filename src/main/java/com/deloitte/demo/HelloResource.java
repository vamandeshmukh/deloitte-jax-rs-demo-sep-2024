package com.deloitte.demo;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/hello")
public class HelloResource {

	@GET
	public String hello() {
		System.out.println("hello");
		return "Hello world!";
	}

}

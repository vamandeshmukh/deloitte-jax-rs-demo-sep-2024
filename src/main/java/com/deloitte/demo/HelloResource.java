package com.deloitte.demo;

import javax.ws.rs.GET;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class HelloResource {

//	url -
//	http://localhost:8090/deloitte-jax-rs-demo/ 

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String hello() {
		System.out.println("hello");
		return "Hello world!";
	}

}

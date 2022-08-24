package com.codingraja.javatech.endpoint.impl;

import javax.jws.WebService;

import com.codingraja.javatech.endpoint.HelloWorld;

//Service Implementation
@WebService(endpointInterface = "com.codingraja.javatech.endpoint.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

	@Override
	public String getHelloWorldAsString(String name) {
		return "Hello World JAX-WS" + name;
	}

}

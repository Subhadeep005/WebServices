package com.codingraja.javatech.endpoint.publisher;

import javax.xml.ws.Endpoint;

import com.codingraja.javatech.endpoint.impl.HelloWorldImpl;

//Endpoint publisher
public class HelloWorldPublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:1234/ws/helloWorld", new HelloWorldImpl());
	}

}

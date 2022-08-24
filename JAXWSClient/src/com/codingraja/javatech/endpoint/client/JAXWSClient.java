package com.codingraja.javatech.endpoint.client;

import com.codingraja.javatech.endpoint.impl.HelloWorld;
import com.codingraja.javatech.endpoint.impl.HelloWorldImplService;

public class JAXWSClient {

	public static void main(String[] args) {
		HelloWorldImplService helloWorldService = new HelloWorldImplService();
		HelloWorld helloWorld = helloWorldService.getHelloWorldImplPort();
		System.out.println(helloWorld.getHelloWorldAsString(" : Subhadeep"));
	}

}

package com.codingraja.javatech.endpoint;

import javax.jws.WebMethod;
import javax.jws.WebService;

//Service Endpoint Interface
@WebService
public interface HelloWorld {

	@WebMethod
	public String getHelloWorldAsString(String name);
}

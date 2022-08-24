package com.codingraja.javatech.testmart;

import javax.xml.ws.Endpoint;

public class TestMartPublihser {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:1234/productcatalog", new ProductCatalog());
	}

}

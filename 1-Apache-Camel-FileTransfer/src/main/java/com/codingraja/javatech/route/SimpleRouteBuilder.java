package com.codingraja.javatech.route;

import org.apache.camel.builder.RouteBuilder;

public class SimpleRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("file:G:/inputFolder?noop=true").to("file:G:/outputFolder");
	}

}

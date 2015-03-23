package com.client;

import java.net.URI;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

public class Clientt {
public static void main(String[] args) {
	ClientConfig config = new DefaultClientConfig();
	Client client = Client.create(config);
	URI  u =UriBuilder.fromUri("http://localhost:8080/RESTDemo")
			.build();
	WebResource service = client.resource(u);
	
	System.out.println(service.path("rest").path("hello").accept(
			MediaType.TEXT_PLAIN).get(ClientResponse.class).toString());
	// Get plain text
	System.out.println(service.path("rest").path("hello").accept(
			MediaType.TEXT_PLAIN).get(String.class));
	 //Get XML
	System.out.println(service.path("rest").path("hello").accept(
			MediaType.TEXT_XML).get(String.class));
	// The HTML
	System.out.println(service.path("rest").path("hello").accept(
			MediaType.TEXT_HTML).get(String.class));
System.out.println();
	System.out.println(service.path("rest").path("checkEmpAnno").accept(
			MediaType.APPLICATION_XML).get(String.class));
}
}

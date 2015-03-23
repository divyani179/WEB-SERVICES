package com.crude;

import java.net.URI;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.representation.Form;

public class JerseyCustomCRUD {
	
	public static void main(String[] args) {
	
		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);
		URI  u =UriBuilder.fromUri("http://localhost:8080/RestCrude").build();
		WebResource service = client.resource(u);
		
		 // create a customer
	    Form form = new Form();
	    form.add("title", "kumarans");
	    form.add("author", "kumaran");
	    form.add("price","1235");
	    
	    ClientResponse response = service.path("rest").path("bookinfo").path("addbook")
	        .type(MediaType.APPLICATION_FORM_URLENCODED)
	        .post(ClientResponse.class, form);
	  //  System.out.println("Return response " + response.getEntity(String.class));
		
		 //Get XML
		System.out.println(service.path("rest").path("bookinfo").path("getall").accept(
				MediaType.APPLICATION_XML).get(String.class));
		
	}

}

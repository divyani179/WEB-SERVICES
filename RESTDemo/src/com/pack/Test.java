package com.pack;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class Test {
@GET
@Produces(MediaType.TEXT_PLAIN)
public String messagePlain(){
	return "Hello Jersey";
	
}
@GET
@Produces(MediaType.TEXT_XML)
public String messageXML(){
	return "<?xml version=\"1.0\"?>"+ "<hello>Hello Jersey"+"</hello>";
	
}

@GET
@Produces(MediaType.TEXT_HTML)
public String messageHtml(){
	return "<html>"+"<title>"+"Hello Jersey"+"</title>"+"<body><h1>"+"hello jersey"
+"</h1></body>"+"<html>";
	
}
}

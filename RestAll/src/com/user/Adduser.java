package com.user;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.bean.User;

@Path("/adduser")
public class Adduser {
	@POST
	@Path("/addform/{username}")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.TEXT_PLAIN)
	  public String addMyForm(@PathParam("username") String username,@FormParam("name") String name, @ FormParam("city") String city){
		return "success"+username;
		
	}
	
	@GET
	@Path("/addquery")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_XML)
	  public User addMyQuery(@QueryParam("name") String name, @ QueryParam("city") String city){
		User u=new User();
		u.setCity(city);
		u.setName(name);
		return u;
		}	

}

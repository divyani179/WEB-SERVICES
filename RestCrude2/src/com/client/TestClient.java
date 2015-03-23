package com.client;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.bean.Book;
import com.dao.BookImpl;
import com.dao.BookInter;
@Path("/bookinfo")
public class TestClient {


		@GET
	    @Path("/getall")
		@Produces(MediaType.APPLICATION_XML)
          public ArrayList<Book> getBooks(){
  			BookInter bi=new BookImpl();
			ArrayList<Book> list=(ArrayList<Book>) bi.getAllBooks();
			return list;
		}
		@GET
		@Path("/addbook")
		@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
		@Produces(MediaType.TEXT_PLAIN)
		public Response addBook(@QueryParam("title") String title ,@QueryParam("author") String author,@QueryParam("price") String price){
			BookInter bi=new BookImpl();
			Book b=new Book();
			  b.setTitle(title);
		     b.setAuthor(author);
		     b.setPrice(Integer.parseInt(price));
		   
			bi.addBook(b);
            
			return Response.status(200).entity(b.toString()).build();

		}
}

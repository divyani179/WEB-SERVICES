package com.client;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

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
		@POST
		@Path("/addbook")
		@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
		@Produces(MediaType.APPLICATION_XML)
		public String addBook(@FormParam("title") String title ,@FormParam("author") String author,@FormParam("price") String price){
			BookInter bi=new BookImpl();
			Book b=new Book();
			  b.setTitle(title);
		     b.setAuthor(author);
		     b.setPrice((Integer.parseInt(price)));
		   
			bi.addBook(b);
            
			return "SUCCESS";

		}
}

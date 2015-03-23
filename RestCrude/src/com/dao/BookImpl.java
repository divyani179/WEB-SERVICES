package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.Book;

public class BookImpl implements BookInter{
	static Connection conn;

	static {
		conn = ModelDao.getconnection();
	}
	List<Book> book = new ArrayList();

	@Override
	public void addBook(Book b) {
		PreparedStatement pre = null;
		String ins = "insert into books values(?,?,msequence.nextval,?)";
		conn = ModelDao.getconnection();
		try {
			pre = conn.prepareStatement(ins);
			pre.setString(1, b.getTitle());
			pre.setString(2, b.getAuthor());
			pre.setFloat(3, b.getPrice());
			pre.execute();
			System.out.println("Added Successfully !!");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ModelDao.closeconnection(conn);
		}
	}

	@Override
	public List<Book> getAllBooks() {
		String disp = "select * from books";
		List<Book> list = new ArrayList();
		PreparedStatement pre = null;
		conn = ModelDao.getconnection();
		try {
			pre = conn.prepareStatement(disp);
			ResultSet res = pre.executeQuery();
			System.out.println("Title \t Author \t Price");
			while (res.next()) {
				String title = res.getString("title");
				String author = res.getString("author");
				int price = res.getInt("price");
				Book bk=new Book();
				bk.setTitle(title);
				bk.setAuthor(author);
				bk.setPrice(price);
				list.add(bk);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ModelDao.closeconnection(conn);
		}
		return list;
	}
}

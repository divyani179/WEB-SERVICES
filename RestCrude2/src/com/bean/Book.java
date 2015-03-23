package com.bean;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Book {
String title;
String author;
int price;
int bookid;
@Override
public String toString() {
	return "Book [title=" + title + ", author=" + author + ", price=" + price
			+ ", bookid=" + bookid + "]";
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getBookid() {
	return bookid;
}
public void setBookid(int bookid) {
	this.bookid = bookid;
}

}

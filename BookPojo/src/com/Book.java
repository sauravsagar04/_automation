package com;

public class Book implements Comparable<Book> {
	private String auther;
	private String bookName;
	private int id;
	public Book(String auther, String bookName, int id) {
		super();
		this.auther = auther;
		this.bookName = bookName;
		this.id = id;
	}
	public String getAuther() {
		return auther;
	}
	public String getBookName() {
		return bookName;
	}
	public int getId() {
		return id;
	}
	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		return this.id-o.id;
	}
	@Override
	public String toString() {
		return "Book [auther=" + auther + ", bookName=" + bookName + ", id=" + id + "]";
	}
	
	

}

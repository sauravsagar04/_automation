package dev;
public class Book {
	private int bookIsbnNo;
	private String auther;
	private String Publisher;
	private Float price;
	public Book(int bookIsbnNo, String auther, String publisher, Float price) {
		super();
		this.bookIsbnNo = bookIsbnNo;
		this.auther = auther;
		this.Publisher = publisher;
		this.price = price;
	}

	public int getBookIsbnNo() {
		return bookIsbnNo;
	}
	public String getAuther() {
		return auther;
	}
	public String getPublisher() {
		return Publisher;
	}
	public Float getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Book [bookIsbnNo=" + bookIsbnNo + ", auther=" + auther + ", Publisher=" + Publisher + ", price=" + price
				+ "]";
	}


	

}

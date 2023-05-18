package dev;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class LibraryService {
	String libraryName;
	String address;
	

	List<Book> books = new ArrayList<Book>();
	public LibraryService() {
		super();

		books.add(new Book(123,"iris","x",12.8f));
		books.add(new Book(124,"siri","y",14.8f));
		books.add(new Book(125,"ample","z",15.8f));
	}

	public void addBook(Book b) {
		books.add(b);
	}
	public void getBook() {
		for(Book b: books) {
			System.out.println(b);
		}
		
	}
	public void removeBook(int bookIsbnNo) {
//		this.books.removeIf(book1-> book1.getBookIsbnNo()== bookIsbnNo); 
		Iterator<Book> boo = books.iterator();
		while(boo.hasNext()) {
			if(boo.next().getBookIsbnNo() == bookIsbnNo) {
				boo.remove();
				break;
			}
				
		}
		
		
	}
	public Book findMaxPrice(String publisher) {
		List<Book> li1 = books.stream().filter(b->b.getPublisher().equals(publisher)).sorted((b,b1)->b1.getPrice().compareTo(b.getPrice())).collect(Collectors.toList());
		if(li1.size() != 0)
			return li1.get(0);
		else
			return null;
	}

}

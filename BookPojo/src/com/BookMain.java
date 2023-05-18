package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookMain{
	public static void main(String args[]) {
		List<Book> b = new ArrayList<Book>();
		b.add(new Book("sagar","x",12));
		b.add(new Book("saurav","y",13));
		b.add(new Book("raj","z",17));
		b.add(new Book("atul","f",10));
	
		Collections.sort(b);
		
		for(Book s: b) {
			System.out.println(s);
			
		}
	
		
	
	}

}

package com.api.demo;

import java.util.ArrayList;
import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import aliens.Book;

@Component
public class BookServices {
  private static List<Book> list=new ArrayList<>();
  
  static {
	list.add(new Book(111,"Cartoon","Sculpture")); 
	list.add(new Book(121,"Newman","Network")); 
	list.add(new Book(131,"Og","Karwan")); 
	list.add(new Book(141,"Ag","Spiritual")); 
}
  
	public List<Book> getAllBooks(){
	return list;
	}
	
	public Book getBookById(int id) {
		Book book=null;	
//		for(int i : list) {
//			if(i==id)
//			return book;
//		}
		book=list.stream().filter(e -> e.getId()==id).findFirst().get();
		return book;
		
	}
}

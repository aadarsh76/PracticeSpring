package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.api.demo.BookServices;

import aliens.Book;

@RestController
@RequestMapping("/api/v1")
public class BookController {
//public Book getBook() {	
//	Book book =new Book();    
//	book.setId(21);
//	book.setName("Dove Theory");
//	book.setAuthor("Charlie");
//	
//	return book;
//	
//}
@Autowired	
public BookServices bookservice=new BookServices();
	
@GetMapping("/books")
public List<Book> getBooks() {
	
	return this.bookservice.getAllBooks();
}
//@GetMapping("/books/{id}")
//public Book getBook(@PathVariable("id") int id) {
//	return this.bookservice.getBookById(id);
//}
}

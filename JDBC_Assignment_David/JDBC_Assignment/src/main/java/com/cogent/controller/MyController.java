package com.cogent.controller;

import java.util.List;

import com.cogent.model.Library;
import com.cogent.service.LibraryServiceImpl;

public class MyController {

	LibraryServiceImpl libServ = new LibraryServiceImpl();
	
	public static void main(String[] args) {
		MyController contr = new MyController();
		
		//contr.addBooks();
		//System.out.println(contr.getAllBooks());
		//contr.updateBook();
		contr.deleteBook();
		
		
		

	}
	
	public void addBooks() {
		
		//Library lib = new Library(2, "Java 8", "Michael");
//		Library lib1 = new Library(3, "Python", "John");
//		Library lib2 = new Library(4, "C++", "Henry");
//		Library lib3 = new Library(5, "Angular", "Susan");
		Library lib4 = new Library(6, "Spring", "Mary");
		
		libServ.addBooks(lib4);
		
		
	}
	
	public List<Library> getAllBooks(){
		return libServ.displayBooks();
	}
	
	
	public void updateBook() {
		int id = 2;
		String name = "JavaScript";
		libServ.updateBooks(id, name);
	}
	
	//delete
	public void deleteBook() {
		int id = 3;
		libServ.deleteBook(id);
	}

}

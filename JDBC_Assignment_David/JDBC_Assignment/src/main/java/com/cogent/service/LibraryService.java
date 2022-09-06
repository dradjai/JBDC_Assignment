package com.cogent.service;

import java.util.List;

import com.cogent.model.Library;

public interface LibraryService {
	
	public void addBooks(Library library);
	
	public List<Library> displayBooks();
	
	public boolean updateBooks(int id, String name);
	
	public void deleteBook(int id);

}

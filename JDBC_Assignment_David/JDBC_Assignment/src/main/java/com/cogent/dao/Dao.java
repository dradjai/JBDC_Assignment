package com.cogent.dao;

import java.util.List;

import com.cogent.model.Library;

public interface Dao {
	
	public void addBooks(Library library);
	
	public List<Library> displayBooks();
	
	public boolean updateBooks(int id, String name);
	
	public void deleteBook(int id);

}

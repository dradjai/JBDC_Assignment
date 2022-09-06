package com.cogent.service;

import java.util.List;

import com.cogent.dao.DaoImpl;
import com.cogent.model.Library;

public class LibraryServiceImpl implements LibraryService {

	DaoImpl dao = new DaoImpl();
	
	@Override
	public void addBooks(Library library) {
		dao.addBooks(library);
		
	}

	@Override
	public List<Library> displayBooks() {
		return dao.displayBooks();
	}

	@Override
	public boolean updateBooks(int id, String name) {
		return dao.updateBooks(id, name);
	}

	@Override
	public void deleteBook(int id) {
		dao.deleteBook(id);
		
	}

}

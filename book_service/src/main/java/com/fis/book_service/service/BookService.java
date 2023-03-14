package com.fis.book_service.service;

import com.fis.book_service.model.Book;

public interface BookService {
	
	Book getBookByID(int id);
	
	boolean saveBook(Book book);
	

}



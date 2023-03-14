package com.fis.book_service.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fis.book_service.model.Book;
import com.fis.book_service.repository.BookRepository;
import com.fis.book_service.service.BookService;

@Service
public class BookServiceImp implements BookService {
	
	@Autowired BookRepository bookRepository;

	@Override
	public Book getBookByID(int id) {
		Book book = bookRepository.findById(id).orElse(null);
		return book;
	}

	@Override
	public boolean saveBook(Book book) {
		return false;
	}

}


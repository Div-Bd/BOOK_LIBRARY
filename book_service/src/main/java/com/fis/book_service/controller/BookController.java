package com.fis.book_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fis.book_service.model.Book;
import com.fis.book_service.service.BookService;

@RestController
@RequestMapping("/books")
public class BookController {
	
	@Autowired BookService bookService;
	
	@GetMapping("/id")
	public Book getById(@RequestParam(value = "id", defaultValue = "1") int id) {
		
		return bookService.getBookByID(id);
		
	}

}

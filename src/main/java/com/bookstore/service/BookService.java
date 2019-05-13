package com.bookstore.service;

import java.util.List;

import com.bookstore.model.Book;

public interface BookService {

	List<Book> findAll();

	Book findById(Long id);

}

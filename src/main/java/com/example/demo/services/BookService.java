package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.models.Book;
import com.example.demo.repositories.BookRepository;

public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public void createBook(@RequestBody Book book) {
        bookRepository.save(book);
    }
}

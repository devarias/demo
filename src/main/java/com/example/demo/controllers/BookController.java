package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Book;
import com.example.demo.services.BookService;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    // @GetMapping("/books") // GET
    // public List<Book> books() {
    //     return bookRepository.findAll();
    // }

    @PostMapping("/books") // POST
    public void createBook(@RequestBody Book book) {
        bookService.createBook(book);
    }

    // @PutMapping("/books")  // PUT
    // public void updateBook(@RequestBody Book book) {
    //     Optional<Book> bookToFind = bookRepository.findById(book.getId());

    //     if (bookToFind != null) {
    //         bookRepository.save(book);
    //     }
    // }

    // @DeleteMapping("/books")  // DELETE
    // public void deleteBook(@RequestParam(value="id") Long id) {
    //     bookRepository.deleteById(id);
    // }

}


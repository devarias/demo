package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.repositories.BookRepository;

public class LoanService {
    
     @Autowired
    private BookRepository bookRepository;
    private LoanRepository loanRepository;
    private UserRepository userRepository;


    
}

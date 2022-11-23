package com.example.dbjointest.service;

import com.example.dbjointest.domain.Book;
import com.example.dbjointest.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public void pushData(){
        Book book = new Book(1L,"hello",1L,1L);
        bookRepository.save(book);
    }
}

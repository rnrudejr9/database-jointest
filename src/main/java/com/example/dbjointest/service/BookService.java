package com.example.dbjointest.service;

import com.example.dbjointest.domain.Author;
import com.example.dbjointest.domain.Book;
import com.example.dbjointest.domain.dto.BookResponse;
import com.example.dbjointest.repository.AuthorRepository;
import com.example.dbjointest.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private AuthorRepository authorRepository;


    public void pushData(){
        Book book = new Book(1L,"hello",new Author(1L,"helloauthor"),1L);
        Author author = new Author(2L,"helloffff");
        bookRepository.save(book);
    }

    public Book printData(Long id){
        Optional<Book> optionalBook = bookRepository.findById(id);
        return optionalBook.get();
    }

    public List<BookResponse> findBooks(Pageable pageable) {
        Page<Book> books = bookRepository.findAll(pageable);
        List<BookResponse> bookResponses = books.stream()
                .map(book -> BookResponse.of(book)).collect(Collectors.toList());
        return bookResponses;
    }

}

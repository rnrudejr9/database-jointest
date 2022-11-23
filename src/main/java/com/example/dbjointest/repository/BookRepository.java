package com.example.dbjointest.repository;

import com.example.dbjointest.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
}

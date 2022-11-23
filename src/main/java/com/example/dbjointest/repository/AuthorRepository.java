package com.example.dbjointest.repository;

import com.example.dbjointest.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.*;

@Repository
public interface AuthorRepository extends JpaRepository<Author,Long> {
}

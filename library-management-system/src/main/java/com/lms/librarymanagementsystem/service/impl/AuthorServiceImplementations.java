package com.lms.librarymanagementsystem.service.impl;

import com.lms.librarymanagementsystem.entity.Author;
import com.lms.librarymanagementsystem.repository.AuthorRepository;
import com.lms.librarymanagementsystem.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImplementations implements AuthorService {

    @Autowired
    AuthorRepository authorRepository;

    @Override
    public String addAuthor(Author author) {

        authorRepository.save(author);
        return "Author added  successfully";
    }
}

package com.backend.Library.service.impl;


import com.backend.Library.model.Book;
import com.backend.Library.repository.BookRepository;
import com.backend.Library.service.IBookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService implements IBookService {
    private final BookRepository bookRepository;

    @Override
    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }
}

package com.backend.Library.service.impl;


import com.backend.Library.model.Book;
import com.backend.Library.repository.BookRepository;
import com.backend.Library.service.IBookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements IBookService {
    private final BookRepository bookRepository;

    @Override
    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    public List<Book> findAllBooksByStatus(boolean bookStatus){
        return bookRepository.findAllBooksByStatus(bookStatus);
    }
}

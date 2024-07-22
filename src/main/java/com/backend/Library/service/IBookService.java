package com.backend.Library.service;

import com.backend.Library.model.Book;

import java.util.List;

public interface IBookService {
    List<Book> findAllBooks();
    List<Book> findAllBooksByStatus(boolean bookStatus);
}

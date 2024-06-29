package com.swp.service;

import com.github.pagehelper.Page;
import com.swp.entity.Book;

import java.util.List;

/**
 * @author: Way
 * description
 * date 2024/6/29 16:09
 */
public interface BookService {
    List<Book> findAll();

    Book getBookById(Long id);


    void borrow(Book book);


    void returnBook(Long id);

    List<Book> search(String borrower, String bookName);
}

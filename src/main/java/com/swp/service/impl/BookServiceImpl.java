package com.swp.service.impl;

import com.swp.entity.Book;
import com.swp.mapper.BookMapper;
import com.swp.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author: Way
 * description
 * date 2024/6/29 16:10
 */
@Service
public class BookServiceImpl implements BookService {
    @Resource
    private BookMapper bookMapper;

    @Override
    public List<Book> findAll() {
        List<Book> bookList = bookMapper.findAll();
        return bookList;
    }

    @Override
    public Book getBookById(Long id) {
        Book book = bookMapper.getBookById(id);
        return book;
    }


    @Override
    public void borrow(Book book) {
        book.setStatus("已借出");
        book.setBorrowDate(LocalDateTime.now());
        book.setReturnDate(null);
        bookMapper.update(book);

    }

    @Override
    public void returnBook(Long id) {
        Book book = bookMapper.getBookById(id);
        book.setStatus("可借阅");
        book.setReturnDate(LocalDateTime.now());
        bookMapper.update(book);
    }

    @Override
    public List<Book> search(String borrower, String bookName) {
        List<Book> bookList= bookMapper.search(borrower,bookName);
        return bookList;
    }

}

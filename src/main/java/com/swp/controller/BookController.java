package com.swp.controller;

import com.swp.entity.Book;
import com.swp.service.BookService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: Way
 * description
 * date 2024/6/29 16:08
 */
@RestController
@RequestMapping("api/books")
@CrossOrigin
public class BookController {
    @Resource
    private BookService bookService;

    @GetMapping
    public List<Book> fetchBooks() {
        List<Book> list = bookService.findAll();
        return list;
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id) {
        return bookService.getBookById(id);
    }

    @PostMapping("/borrow")
    public void borrowBook(@RequestBody Book book) {
        bookService.borrow(book);
    }

    @PostMapping("/return/{id}")
    public void returnBook(@PathVariable Long id) {
        bookService.returnBook(id);
    }

    @GetMapping("search")
    public List<Book> search(String borrower, String bookName) {
        List<Book> bookList = bookService.search(borrower, bookName);
        return bookList;
    }
}

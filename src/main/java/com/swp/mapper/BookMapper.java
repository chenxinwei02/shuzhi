package com.swp.mapper;

import com.swp.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author: Way
 * description
 * date 2024/6/29 16:11
 */
@Mapper
public interface BookMapper {
    @Select("select * from books")
    List<Book> findAll();
    @Select("select  * from books where id=#{id}")
    Book getBookById(Long id);

    void insert(Book book);

    void update(Book book);

    List<Book> search(@Param("borrower") String borrower, @Param("bookName")String bookName);
}

package com.swp.entity;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author: Way
 * description
 * date 2024/6/29 16:15
 */
@Data
public class Book {
    private Integer id;
    private String title;
    private String author;
    private String status;
    private String borrower;
    private LocalDateTime borrowDate;
    private LocalDateTime returnDate;
}

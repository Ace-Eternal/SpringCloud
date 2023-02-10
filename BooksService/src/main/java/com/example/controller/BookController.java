package com.example.controller;

import com.example.pojo.Book;
import com.example.service.BookService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class BookController {
    @Resource
    BookService service;

    @RequestMapping ("/book/{bid}")
    public Book getBook(@PathVariable(value = "bid") int bid){
        return service.queryBook(bid);
    }
}

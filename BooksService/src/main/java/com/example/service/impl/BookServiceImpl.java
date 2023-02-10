package com.example.service.impl;

import com.example.dao.BookMapper;
import com.example.pojo.Book;
import com.example.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BookServiceImpl implements BookService {
    @Resource
    BookMapper mapper;

    @Override
    public Book queryBook(int bid) {
        return mapper.findBookByBid(bid);
    }
}

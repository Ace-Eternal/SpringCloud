package com.example.service;

import com.example.pojo.Book;
import org.springframework.stereotype.Service;

public interface BookService {
    Book queryBook(int bid);
}

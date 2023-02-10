package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan(value = "com.example.dao")
@SpringBootApplication
public class BooksServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(BooksServiceApplication.class,args);
    }
}

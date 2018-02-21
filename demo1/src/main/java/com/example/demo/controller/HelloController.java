package com.example.demo.controller;


import com.example.demo.modle.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@EnableConfigurationProperties(Book.class)

@RestController
public class HelloController {


    static int count = 0;


    @Autowired
    private Book book;


    @RequestMapping("/springboot")
    public String Hello() {

        // Book book=new Book();
        StringBuilder sb = new StringBuilder();
        sb.append("Hello SpringBoot! access count:" + (++count) + " \r\n");
        sb.append("book name:" + book.getName() + " author:" + book.getAuthor());

        return sb.toString();
    }
}
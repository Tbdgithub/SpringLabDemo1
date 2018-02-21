package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(
        {
                "com.example.demo.mapper"
                ,
                "com.example.demo.mapperxml"
        })
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        System.out.println("hi");
        SpringApplication.run(DemoApplication.class, args);

        System.out.println("end hi");

    }
}

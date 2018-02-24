package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@MapperScan(
        {
                "com.example.demo.mapper"
                ,
                "com.example.demo.mapperxml"
        })
@SpringBootApplication
public class Demo1Application {

    public static void main(String[] args) {

        System.out.println("hi");
        SpringApplication.run(Demo1Application.class, args);

        System.out.println("end hi");

    }
}

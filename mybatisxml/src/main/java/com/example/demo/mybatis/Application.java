package com.example.demo.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.demo.mybatis.mapper")
public class Application {

	public static void main(String[] args) {

		System.out.println("I will begin");


		SpringApplication.run(Application.class, args);
		System.out.println("I am:"+Application.class.getName());

	}
}

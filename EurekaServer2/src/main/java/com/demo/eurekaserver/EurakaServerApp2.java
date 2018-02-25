package com.demo.eurekaserver;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class EurakaServerApp2 {

    public static void main(String[] args) {

        new SpringApplicationBuilder(EurakaServerApp2.class).web(true).run(args);
        System.out.println("EurakaServerApp2 started");
    }
}

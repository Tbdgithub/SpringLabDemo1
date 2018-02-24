package com.didispace;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekServer1Application {

	public static void main(String[] args) {

		new SpringApplicationBuilder(EurekServer1Application.class).web(true).run(args);
		System.out.println("i started");
	}

}

package com.didispace;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient
@SpringBootApplication

public class ConsumerApp1 {

	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();

	}

	public static void main(String[] args) {
		new SpringApplicationBuilder(ConsumerApp1.class).web(true).run(args);
		System.out.println("ConsumerApp1");

	}

}

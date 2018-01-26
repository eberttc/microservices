package com.learning.microservices.credit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@EnableDiscoveryClient
@EnableAutoConfiguration	
@SpringBootApplication
@EnableCircuitBreaker
@EnableFeignClients
@ComponentScan(basePackages="com.learning.microservices.credit")
public class CreditApp {

	public static void main(String[] args) {
		SpringApplication.run(CreditApp.class, args);
	}

}

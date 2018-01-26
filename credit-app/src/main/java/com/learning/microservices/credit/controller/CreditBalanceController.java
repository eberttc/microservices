package com.learning.microservices.credit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.microservices.credit.feign.ClientFeign;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RefreshScope
public class CreditBalanceController {

	@Value("${credit.title}")
	private String title;
	
	@Autowired
	private ClientFeign client;
	
//	@HystrixCommand(fallbackMethod = "reliable")
	@RequestMapping(value="/app/getBalance")
	public String currentBalance(){
		
		String name = client.getClientInfo("1");
		
		return "Client:"+ name + title+" Current balance 0";
	}
	
	public String reliable() {
		// return "Cloud Native Java (O'Reilly)";
		return "error";
	}
}

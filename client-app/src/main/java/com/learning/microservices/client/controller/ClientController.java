package com.learning.microservices.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

	@GetMapping("getClientInfo")
	public String getClientInfo(@RequestParam(required=false) String id){
		String name="Ebert";
		return name;
	}
}

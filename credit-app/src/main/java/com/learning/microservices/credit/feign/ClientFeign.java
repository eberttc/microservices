package com.learning.microservices.credit.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name ="client") 
public interface ClientFeign {
	
	@RequestMapping(method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE }, value = "/getClientInfo")
	public String getClientInfo(@RequestParam(name="id",required=false) String id);
}

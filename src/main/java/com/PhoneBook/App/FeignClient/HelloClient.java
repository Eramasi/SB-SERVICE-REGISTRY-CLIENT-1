package com.PhoneBook.App.FeignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="Hello-Service")
public interface HelloClient {
	
	
	@GetMapping(value="/Hello/{name}")
	public String invokeHelloService(@PathVariable("name") String name);

}

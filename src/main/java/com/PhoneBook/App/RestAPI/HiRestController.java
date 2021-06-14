package com.PhoneBook.App.RestAPI;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.PhoneBook.App.FeignClient.HelloClient;

@RestController
public class HiRestController {
	
	@Autowired
	private HelloClient helloclient;
	
	@GetMapping(value="/Hi/{name}") 	 	 	
	public String LoginService1(@PathVariable("name") String name)
	{	
	    String msg="Hi ";
		
		String hellomsg=helloclient.invokeHelloService(name);
		
		return msg + "-- "+ hellomsg;
		
    }


}

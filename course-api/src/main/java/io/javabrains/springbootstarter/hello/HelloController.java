package io.javabrains.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//To make any class a rest controller
// That is means that this class should have methods to map to the URL requests
@RestController
public class HelloController {
	
	//Provide HTTP responses to HTTP requests
	@RequestMapping("/hello")
	public String sayHi()
	{
		return "Hi";
    }

}

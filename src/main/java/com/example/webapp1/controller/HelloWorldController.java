package com.example.webapp1.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.*;


@RestController
public class HelloWorldController {
	
	@RequestMapping("/")
	public String sayHello() {
		return "Hello, The Infrastructure has been deployed successfully"
			+
			"\n"
			+
			"Please proceed with the application deployment using CICD Pipeline"
			+
			"\n";
	}

}

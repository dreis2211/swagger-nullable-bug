package com.example.swagger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping
	public String hello(TestData test) {
		return "Hello world: " + test.toString();
	}

}

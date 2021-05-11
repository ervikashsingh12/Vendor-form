package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@RequestMapping(method= RequestMethod.GET, path="/hello-test")
	public String helloWorld() {
		return "Hello Vikash";
	}
	
	@GetMapping(path="/hello-test1")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello Vikash Bean");
	}
	
	@GetMapping(path="/hello-test/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello, %s", name));
	}
	
}

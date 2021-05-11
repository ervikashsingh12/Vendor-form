package com.example.test.cts.demotest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloCTSController {
	
	@RequestMapping(method = RequestMethod.GET, path="/hello-test")
	public String helloWorld() {
		return "HelloVikash";
	}
	
	@RequestMapping(method = RequestMethod.GET, path="/hello-bean")
	public CTSbean helloWorldBean() {
		return new CTSbean("Welcome to CTS");
	}
	
	
}

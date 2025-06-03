package com.ninja.Github_Actions_demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@RequestMapping("/test")
	public String test()
	{
		return "hello test";
	}
	
	@RequestMapping("/home")
	public String home()
	{
		return "hello home";
	}
}

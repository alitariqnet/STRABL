package com.STRABLAPP.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@RequestMapping(name="/welcome")
public class AppController {

	@RequestMapping("/")
	public @ResponseBody String greeting() {
		return "Hello, World";
	}
	
}

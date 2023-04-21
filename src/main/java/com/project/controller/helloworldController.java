package com.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class helloworldController {

	@RequestMapping("/hello")
	public String hello() {
		return "helloworld";
	}
}

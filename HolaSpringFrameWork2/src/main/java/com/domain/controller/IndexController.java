package com.domain.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping("/home") 
	public String goIndex() {
		System.out.println("Paso por el controller");
		return "index";
	}
}

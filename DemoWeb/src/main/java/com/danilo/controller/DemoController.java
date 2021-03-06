package com.danilo.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.danilo.model.Persona;
import com.danilo.repo.IPersonaRepo;


@Controller
public class DemoController {
	
	@Autowired
	private IPersonaRepo repo;

	@GetMapping("/greeting")
	public String greeting(@RequestParam(name = "name", required=false, defaultValue = "World") String name, Model model) {
		if(name==null || name.isEmpty())
			name="DaniloCode";
		if(name.endsWith("World")) {
			repo.delete(new Persona(1, "Danilo de Jesus"));
			name="Danilocode";
		}
		Persona per=new Persona(0, name);
		repo.save(per);
		model.addAttribute("name", name);
		return "greeting";
	}
	
}

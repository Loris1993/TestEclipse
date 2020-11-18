package com.example.demoGit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/")
public class HelloSpringBoot {


	
	@GetMapping
	public String getWerlcome(Model model) {
		
		
		model.addAttribute("hello", "ciao mondo");
		model.addAttribute("pippo", "ciao pippo");
		
		
		return "index";
		
		
		
	}
	
	
}

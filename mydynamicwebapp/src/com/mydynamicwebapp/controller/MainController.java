package com.mydynamicwebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	//Handle1 method for specific HTTP Request GET or POST by view
	@RequestMapping("/")
	 public String showHome() {
		 
		 return "homePage";
	 }
	//Handle2
	
	//Handle3
	
	//Handle etc
}

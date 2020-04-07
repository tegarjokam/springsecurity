package com.tegar.secureapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {
	
	@RequestMapping("/home")
	private String home() {
		return "<h1> HOMEPAGE </h1>";
	}

}

package com.tegar.secureapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {
	
	@RequestMapping("/profile")
	public String user() {
		return "<h1> PROFILE PAGE </h1>";
	}
	
//	@RequestMapping("/management")
//	public String management() {
//		return "<h1> PROFILE MANAGEMENT </h1>";
//	}

}

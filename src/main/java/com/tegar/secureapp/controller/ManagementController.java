package com.tegar.secureapp.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ManagementController {
	
	@PreAuthorize("hasRole('ROLE_MANAGEMENT')")
	@RequestMapping("/management")
	public String management() {
		return "<h1> MANAGEMENT </h1>";
	}

}

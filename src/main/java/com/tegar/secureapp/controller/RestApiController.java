package com.tegar.secureapp.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/rest")
public class RestApiController {
	
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@RequestMapping("/book")
	public String book() {
		return "<h1> BOOK </h1>";
	}
	
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@RequestMapping("/favoriteBook")
	public String favoriteBook() {
		return "<h1> FAVORITE BOOK </h1>";
	}
}

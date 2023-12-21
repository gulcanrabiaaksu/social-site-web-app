package com.social.socialsite.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController {
	
	@GetMapping
	public String homeControllerHandler() {
		return "this is home controller";
	}

//@PutMapping	
//@PostMapping
//@DeleteMapping
}

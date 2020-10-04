package com.advait.policy;

import org.springframework.web.bind.annotation.GetMapping;

public class WelcomeController {
	
	@GetMapping(value= {"/","/welcome","index.html"})
	public String welcome() {
		return "Welcome to policy service!";
	}

}

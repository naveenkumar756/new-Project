package com.nav.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Signin {
	@GetMapping("/signin")
	public String signin() {
		return "signin";
	}
}
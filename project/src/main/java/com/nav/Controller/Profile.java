package com.nav.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Profile{
	@GetMapping("/profile")
	public String profile() {
		return "Profile";
	}
}






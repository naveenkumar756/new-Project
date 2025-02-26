package com.nav.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class LoginController {
	@GetMapping("/home")
	public String viewIndex() {
		
	System.out.println("hello");
	return"index";
}
	
}

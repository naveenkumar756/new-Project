package com.nav.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class Thankyou {
	@GetMapping("/thankyou")
	public String thankyou() {
		return "Thankyou";
	}
}



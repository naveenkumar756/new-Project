package com.nav.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class Seatselection {
	@GetMapping("/seatselection")
	public String seatselection() {
		return "Seatselection";
	}
}



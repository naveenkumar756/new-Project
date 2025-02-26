package com.nav.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Movieinfo {
	@GetMapping("/movieinfo")
	public String movieinfo() {
		return "Movieinfo";

}
}

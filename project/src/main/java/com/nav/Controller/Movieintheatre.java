package com.nav.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Movieintheatre {
	@GetMapping("/movieintheatre")
	public String movieintheatre() {
	return"Movieintheatre";

}
}

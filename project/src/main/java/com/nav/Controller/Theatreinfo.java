package com.nav.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Theatreinfo {
	@GetMapping("/Thankyou")
		public String Thankyou() {
			return "Thankyou";
		}
	}



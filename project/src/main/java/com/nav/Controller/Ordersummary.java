package com.nav.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class  Ordersummary{
	@GetMapping ("/Ordersummary")
	public String ordersummary() {
	return"Ordersummary";

}
}
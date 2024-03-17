package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //annotation xác định class này là Controller
public class HomeController {
	@GetMapping("/")
	public String homePage() {
		return "index";
	}
}

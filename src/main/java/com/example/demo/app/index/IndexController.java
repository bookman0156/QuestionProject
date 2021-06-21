package com.example.demo.app.index;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//@Controller
//@RequestMapping("/")
public class IndexController {
	@GetMapping
	public String index(Model model) {
		return "/index.html";
	}
}

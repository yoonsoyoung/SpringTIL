package com.practice.doeat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DoeatController {

	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("msg", "안녕 여긴 인덱스 페이지 JSP 야");
		return "index";
	}
	
	@GetMapping("/test")
	public String home() {
		return "sub/test";
	}
}

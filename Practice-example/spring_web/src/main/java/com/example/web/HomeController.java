package com.example.web;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.web.dto.ParamDto;
import com.example.web.service.HelloService;
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private HelloService helloService;
	
//	@RequestMapping(value = "/", method = RequestMethod.GET)
	@GetMapping("/")
	public String home(Locale locale, Model model) {
		
		return "index";
	}
	
	@RequestMapping("/hello")
	public ModelAndView hello() {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("msg", helloService.greeting());
		mav.setViewName("step01/hello");
		
		return mav;
	}
	
	@GetMapping("/form")
	public String form() { // 단순 이동, 뷰의 이름만 리턴
		return "step02/form"; 
	}
	
	@GetMapping("/sendparam")
	public String param(@RequestParam String userid, @RequestParam String username, @RequestParam String area) {
		System.out.println(userid + " " + username + " " + area);
		return "step02/form";
	}

	@PostMapping("/sendparam")
	public String param(ParamDto paramDto, Model model) {
		model.addAttribute("userinfo", paramDto); // "userinfo" 에다가 paramDto를 담아라
		return "step02/result";
	}
}

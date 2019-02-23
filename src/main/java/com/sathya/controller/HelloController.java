package com.sathya.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping(value="/welcome", method=RequestMethod.GET)
	public ModelAndView sayHello(){
		return new ModelAndView("hello","message","Welcome to Spring MVC");

	}

}

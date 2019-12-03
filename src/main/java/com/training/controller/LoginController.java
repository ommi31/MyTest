package com.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.training.service.LoginService;

@Controller
public class LoginController {
	@Autowired
	LoginService loginService;
	public String getLoginIndex() {
		return "index";
	}
	
	@RequestMapping("login")
	public ModelAndView validate(@RequestParam ("nm")String nm,@RequestParam ("pass")String pass ) {
		boolean ans=loginService.validate(nm,pass);
		if(ans)
		{
		return new ModelAndView("displaybook");
		}
		else
		{
			return new ModelAndView("redirect:/index");
		}
	}
	
}

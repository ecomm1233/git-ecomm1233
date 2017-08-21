package com.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorlController {
	@RequestMapping("/hello")
	public ModelAndView helloWorld(HttpServletRequest request,HttpServletResponse response){
		
		//String message = "Hello Spring MVC";
		
		//return new ModelAndView("hellopage","message",message);
		
		String username = request.getParameter("username");
		String password = request.getParameter("pass");
		
		if(username.equalsIgnoreCase("admin")){
			String message="Hello Mr. "+username;
			return new ModelAndView("hellopage","message",message);
		}else{
			return new ModelAndView("errorpage","message","Sorry username or password error");
		}
		
	}
	
}

package com.imcs.krishna.spring.mvc;

import javax.jws.soap.SOAPBinding;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping(method=RequestMethod.GET,value="/hello")
	public String sayHello() {
		
		return "Hello";
	}

	@RequestMapping(method=RequestMethod.GET,value="/test")
	public String test(@RequestParam(name="name") String name, ModelMap model ) {
         System.out.println(name);
		model.addAttribute("requestName", name);
		
		return "Hello";
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/modelandview")
	public ModelAndView hello(@RequestParam(name="name") String name,HttpSession httpSession) {
		
		ModelAndView modelAndView = new ModelAndView(); 
		modelAndView.addObject("requestName", name);
		modelAndView.setViewName("Hello");
		httpSession.setAttribute("sessionName", name);
		
		
         System.out.println(name);
		//model.addAttribute("name", name);
		
		return modelAndView;
	}

}

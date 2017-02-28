package com.jackie.springmvc.handlers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class User {
	
	private Model model=null;

	@RequestMapping("/userinfo")
	public String getUser(Emploee user){
		System.out.println("–’√˚£∫"+user.getUserName()+",ƒÍ¡‰£∫"+user.getAge());
		model.addAttribute("name",user.getUserName());
		model.addAttribute("age",user.getAge());
		return "user";		
	}
}

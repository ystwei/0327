package com.weikun.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.weikun.po.User;


@Controller
@RequestMapping(value="/valid")
public class ValidController {
	
	@RequestMapping(value="/main")
	public String main(Model m){
		
		User u=new User();
		
		m.addAttribute("user", u);
		
		return "add";
		
	}
	
	@RequestMapping(value="/verify")
	public String verify(
			@Valid User u,
			BindingResult result,
			Map map
			){
		
		if(result.hasErrors()){
			return "add";
		}
		map.put("u", u);
		return "success";
	}
}

package com.weikun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.weikun.po.User;

@Controller
@RequestMapping(value={"/my"})
public class MyController {
	
	@RequestMapping(value={"/test1"})
	public String test1(User user){
		
		
		System.out.println(user.getPwd());
		System.out.println(user.getUsername());
		
		return "success";
	}
}

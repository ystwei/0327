package com.weikun.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.weikun.po.User;

@Controller
@RequestMapping(value={"/my"})
@SessionAttributes(value={"realname","password"})
public class MyController {

	@RequestMapping(value={"/test1"})
	public String test1(
			Model model,//从后端传到前端
			Map map,
			ModelMap m,
			User user// 从前端传到后端
			){
		model.addAttribute("pwd1", user.getPwd());
		map.put("pwd2", user.getPwd());
		m.addAttribute("pwd3", user.getPwd());

		System.out.println(user.getPwd());
		System.out.println(user.getUsername());

		return "success";
	}
	@RequestMapping(value={"/test2"})
	public String test2(@RequestParam String username,
			@RequestParam String pwd,
			@RequestParam(value="sex") String mysex,
			Model model
			){

		System.out.println(username);
		System.out.println(pwd);
		System.out.println(mysex);
		model.addAttribute("pwd1",pwd);
		return "success";
	}

	@RequestMapping(value={"/test3"})
	public String test3(@RequestParam String[] username){
		System.out.println(username[0]);
		System.out.println(username[1]);


		return "success";
	}
	
	@RequestMapping(value={"/test4"})
	public String test4(@RequestParam List<String> username){
		
		System.out.println(username.get(0));
		System.out.println(username.get(1));
		return "success";
	}
	
	
	@RequestMapping(value={"/test5"})
	public String test5(
			@CookieValue(value="hid",defaultValue="0") Long hid ,
			HttpServletResponse response){
		hid++;
		Cookie c=new Cookie("hid",hid.toString());
		response.addCookie(c);
		return "cookie";
	}
	
	@RequestMapping(value={"/test6"})
	public String test6(User user1,Model model){
		
		System.out.print(model.containsAttribute("user"));
		User u=(User)model.asMap().get("user");
		System.out.print(u.getUsername());
		return "success";
	}
	
	@RequestMapping(value={"/test7"})
	public @ModelAttribute  User test7(User user1){
		System.out.println(user1.getPwd());
		return user1;
	}
	
	
	@RequestMapping(value={"/test8"})
	public @ModelAttribute  List<User> test8(){
		
		return Arrays.asList(new User("weikun","999"),new User("mike","1111"));
	}
	
	
	@RequestMapping(value={"/test9"})
	public @ModelAttribute  Map<String,User> test9(){
		Map<String,User> m=new HashMap<String,User>();		
		m.put("A", new User("weikun","999"));
		m.put("B", new User("mike","1111"));		
		return m;
	}
	
	
	@RequestMapping(value={"/test10"})
	public   String test10(User u,Model model){
		model.addAttribute("realname", u.getUsername());
		model.addAttribute("password", u.getPwd());
		
		return "session";
	}
}

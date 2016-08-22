package com.weikun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value={"/param"})
public class ParamController {


	@RequestMapping(value={"/del/name/{username}/pwd/{password}"})
	public ModelAndView del(
			@PathVariable(value="username") String username,
			@PathVariable(value="password") String password){		
		ModelAndView mv=new ModelAndView();

		System.out.print(username);
		System.out.print( password);
		mv.addObject("h1", username+"---"+password);
		mv.setViewName("success");
		return mv;
	}
	@RequestMapping(value="/users/**")
	public ModelAndView test1(){
		ModelAndView mv=new ModelAndView();
		
		mv.setViewName("success");
		return mv;
	}
	@RequestMapping(
			method=RequestMethod.GET,
			value="/regex/{phone:\\d+}-{num:\\d+}"
			
			)
	public ModelAndView test2(
			@PathVariable(value="phone") String phone,
			@PathVariable(value="num") String num){
		ModelAndView mv=new ModelAndView();
		mv.addObject("h1", phone+"---"+num);
		mv.setViewName("success");
		return mv;
		
	}

}

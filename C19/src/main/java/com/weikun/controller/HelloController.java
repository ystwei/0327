package com.weikun.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping(value={"/hello","/hello1"})//通过它访问该类
public class HelloController {
//public class HelloController implements Controller {
	
	@RequestMapping(value={"/add"})//通过它访问该方法
	public ModelAndView add(){
		ModelAndView mv=new ModelAndView();
		
		mv.setViewName("success");
		mv.addObject("h1", "MIKE");
		System.out.print("ok");	
		
		return mv;
	}
	
//	@Override
//	public ModelAndView handleRequest(HttpServletRequest request,
//			HttpServletResponse response) throws Exception {
//		// TODO Auto-generated method stub
//		ModelAndView mv=new ModelAndView();
//		mv.setViewName("success");
//		mv.addObject("h1", "MIKE");
//		System.out.print("ok");	
//		return mv;
//	}

}

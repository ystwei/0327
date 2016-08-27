package com.weikun.control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.weikun.vo.User;

import freemarker.core.Configurable;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;




@WebServlet(name="/hello",urlPatterns={"*.do"})
public class HelloControl extends HttpServlet {
	private Configuration cfg;
	/**
	 * Constructor of the object.
	 */
	
	public HelloControl() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String path=request.getServletPath();//  /hello.do
		//text 
		
		
		
		Template t=cfg.getTemplate(path.substring(1, path.length()-3)+".ftl");
		Map map=new HashMap();
		
		
		
		map.put("users",Arrays.asList(new User(10,"mike"),new User(20,"javk") ));
		map.put("user", "黑龙江");
		
		map.put("score", "77");
		
		response.setContentType("text/html; charset=GBK" );
		PrintWriter out=response.getWriter();
		try {
			t.process(map, out);
		} catch (TemplateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doGet(request, response);
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
		cfg=new Configuration();
		cfg.setServletContextForTemplateLoading(this.getServletContext(), "template");
		
		
	}

}

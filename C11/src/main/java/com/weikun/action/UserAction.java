package com.weikun.action;

import java.util.Map;













import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Actions;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.ActionSupport;
import com.weikun.vo.User;

/*  
    <package name="default" extends="struts-default">	
		<action name="user1" class="com.weikun.action.UserAction">
			<result name="success">/success.jsp</result>
			<result name="error">/index.jsp</result>		
		</action>	
	</package>	
 */
@ParentPackage(value="struts-default")
//@Actions({
//	@Action(value="user1",
//			results={
//				@Result(name="success",location="/success.jsp"),
//				@Result(name="error",location="/index.jsp")
//			}),
//	@Action(value="user2",
//	results={
//		@Result(name="success",location="/success.jsp"),
//		@Result(name="error",location="/index.jsp")
//	})
//
//	
//})
@Results({
	
	@Result(name="success",location="/success.jsp"),
	@Result(name="error",location="/index.jsp")
	
})
@Action(value="user1")
public class UserAction  implements RequestAware,SessionAware,ServletContextAware {
	
	private HttpServletRequest req= ServletActionContext.getRequest();
	private String username;
	
	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	private User user;
	
	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public String add() throws Exception {
		// TODO Auto-generated method stub
		//String sex=req.getParameter("sex");
	//	System.out.print(username );
		//System.out.print(user.getPwd() );
//		/System.out.print(sex );
		System.out.print("ok");
		return "success";
	}
	
	
	public String del() throws Exception {
		// TODO Auto-generated method stub
		
		System.out.print("del");
		
		return "success";
	}
	@Override
	public void setRequest(Map<String, Object> request) {
		// TODO Auto-generated method stub
		request.put("name", "weikun");
	}


	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		session.put("sname", "sweikun");
	}


	@Override
	public void setServletContext(ServletContext context) {
		// TODO Auto-generated method stub
		context.setAttribute("aname", "aweikun");
	}
}

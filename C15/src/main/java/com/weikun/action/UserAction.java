package com.weikun.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Actions;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.weikun.po.Myuser;
import com.weikun.service.IUserService;
import com.weikun.service.UserServiceImpl;


//@ParentPackage(value="struts-default")
//@Namespace(value="/")
//@Controller
//@Action(value="user1")
//@Results({
//	
//	@Result(name="show",location="/show.jsp"),
//	@Result(name="amain",location="/amain.jsp")
//	
//})
public class UserAction {
	private Myuser user;
	
	public Myuser getUser() {
		return user;
	}
	public void setUser(Myuser user) {
		this.user = user;
	}
	private String id;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	private IUserService service;
	
	public IUserService getService() {
		return service;
	}
	
	public void setService(IUserService service) {
		this.service = service;
	}
	private List<Myuser> list;
	public List<Myuser> getList() {
		return list;
	}
	public void setList(List<Myuser> list) {
		this.list = list;
	}
	public String del(){
		service.del(Integer.parseInt(id));
		return show();
	}
	public String show(){
		this.list=service.queryAll();
		return "show";
	}	
	
	public String amain(){
		if(id!=null){//增加
			this.user=this.service.queryUserByid(Integer.parseInt(id));
		}
		
		
		
		return "amain";
	}
	public String add(){
		service.addorupdate(user);
		return show();
	}
}

package com.weikun.po;

import java.io.Serializable;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

public class User implements Serializable {
	@NotEmpty
	private String username;
	@NotEmpty
	private String pwd;
	@NotEmpty
	@Pattern(regexp = "^\\d+$")  
	@Range(min=0, max=256)
	private String age;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	
}

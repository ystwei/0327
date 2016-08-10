package com.weikun.po;

import java.io.Serializable;

public class User implements Serializable {
	private String usrname;
	private String password;
	public String getUsrname() {
		return usrname;
	}
	public void setUsrname(String usrname) {
		this.usrname = usrname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}

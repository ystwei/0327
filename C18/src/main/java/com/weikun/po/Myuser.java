package com.weikun.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Myuser entity. @author MyEclipse Persistence Tools
 */

public class Myuser implements java.io.Serializable {

	// Fields

	private Integer id;
	private String username;
	private String pwd;

	// Constructors

	/** default constructor */
	public Myuser() {
	}

	/** full constructor */
	public Myuser(String username, String pwd) {
		this.username = username;
		this.pwd = pwd;
	}

	// Property accessors
	
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	
	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

}
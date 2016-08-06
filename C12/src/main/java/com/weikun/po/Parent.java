package com.weikun.po;

import java.util.HashSet;
import java.util.Set;

/**
 * Parent entity. @author MyEclipse Persistence Tools
 */

public class Parent implements java.io.Serializable {

	// Fields

	private Integer pid;
	private String pname;
	private Set sonses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Parent() {
	}

	/** minimal constructor */
	public Parent(String pname) {
		this.pname = pname;
	}

	/** full constructor */
	public Parent(String pname, Set sonses) {
		this.pname = pname;
		this.sonses = sonses;
	}

	// Property accessors

	public Integer getPid() {
		return this.pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return this.pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Set getSonses() {
		return this.sonses;
	}

	public void setSonses(Set sonses) {
		this.sonses = sonses;
	}

}
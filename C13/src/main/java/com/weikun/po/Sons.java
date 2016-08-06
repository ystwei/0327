package com.weikun.po;

/**
 * Sons entity. @author MyEclipse Persistence Tools
 */

public class Sons implements java.io.Serializable {

	// Fields

	private Integer sid;
	private Parent parent;
	private String sname;

	// Constructors

	/** default constructor */
	public Sons() {
	}

	/** full constructor */
	public Sons(Parent parent, String sname) {
		this.parent = parent;
		this.sname = sname;
	}

	// Property accessors

	public Integer getSid() {
		return this.sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public Parent getParent() {
		return this.parent;
	}

	public void setParent(Parent parent) {
		this.parent = parent;
	}

	public String getSname() {
		return this.sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

}
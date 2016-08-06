package com.weikun.po;

import java.util.HashSet;
import java.util.Set;

/**
 * Stu entity. @author MyEclipse Persistence Tools
 */

public class Stu implements java.io.Serializable {

	// Fields

	private Integer sid;
	private String sname;
	private Set teas = new HashSet(0);

	// Constructors

	/** default constructor */
	public Stu() {
	}

	/** minimal constructor */
	public Stu(Integer sid, String sname) {
		this.sid = sid;
		this.sname = sname;
	}

	/** full constructor */
	public Stu(Integer sid, String sname, Set teas) {
		this.sid = sid;
		this.sname = sname;
		this.teas = teas;
	}

	// Property accessors

	public Integer getSid() {
		return this.sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getSname() {
		return this.sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Set getTeas() {
		return this.teas;
	}

	public void setTeas(Set teas) {
		this.teas = teas;
	}

}
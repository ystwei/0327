package com.weikun.po;

/**
 * Hus entity. @author MyEclipse Persistence Tools
 */

public class Hus implements java.io.Serializable {

	// Fields

	private Integer id;
	private String hname;
	private Wife wife;

	// Constructors

	/** default constructor */
	public Hus() {
	}

	/** minimal constructor */
	public Hus(Integer id, String hname) {
		this.id = id;
		this.hname = hname;
	}

	/** full constructor */
	public Hus(Integer id, String hname, Wife wife) {
		this.id = id;
		this.hname = hname;
		this.wife = wife;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getHname() {
		return this.hname;
	}

	public void setHname(String hname) {
		this.hname = hname;
	}

	public Wife getWife() {
		return this.wife;
	}

	public void setWife(Wife wife) {
		this.wife = wife;
	}

}
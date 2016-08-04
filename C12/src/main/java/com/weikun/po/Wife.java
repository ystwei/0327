package com.weikun.po;

/**
 * Wife entity. @author MyEclipse Persistence Tools
 */

public class Wife implements java.io.Serializable {

	// Fields

	private Integer id;
	private Hus hus;
	private String wname;

	// Constructors

	/** default constructor */
	public Wife() {
	}

	/** full constructor */
	public Wife(Integer id, Hus hus, String wname) {
		this.id = id;
		this.hus = hus;
		this.wname = wname;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Hus getHus() {
		return this.hus;
	}

	public void setHus(Hus hus) {
		this.hus = hus;
	}

	public String getWname() {
		return this.wname;
	}

	public void setWname(String wname) {
		this.wname = wname;
	}

}
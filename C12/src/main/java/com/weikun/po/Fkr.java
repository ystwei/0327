package com.weikun.po;

/**
 * Fkr entity. @author MyEclipse Persistence Tools
 */

public class Fkr implements java.io.Serializable {

	// Fields

	private FkrId id;
	private Integer old;

	// Constructors

	/** default constructor */
	public Fkr() {
	}

	/** full constructor */
	public Fkr(FkrId id, Integer old) {
		this.id = id;
		this.old = old;
	}

	// Property accessors

	public FkrId getId() {
		return this.id;
	}

	public void setId(FkrId id) {
		this.id = id;
	}

	public Integer getOld() {
		return this.old;
	}

	public void setOld(Integer old) {
		this.old = old;
	}

}
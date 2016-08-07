package com.weikun.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Sons entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "sons", catalog = "test")
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
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "sid", unique = true, nullable = false)
	public Integer getSid() {
		return this.sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "pid", nullable = false)
	public Parent getParent() {
		return this.parent;
	}

	public void setParent(Parent parent) {
		this.parent = parent;
	}

	@Column(name = "sname", nullable = false, length = 10)
	public String getSname() {
		return this.sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

}
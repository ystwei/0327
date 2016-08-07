package com.weikun.po;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Parent entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "parent", catalog = "test")
public class Parent implements java.io.Serializable {

	// Fields

	private Integer pid;
	private String pname;
	private Set<Sons> sonses = new HashSet<Sons>(0);

	// Constructors

	/** default constructor */
	public Parent() {
	}

	/** minimal constructor */
	public Parent(String pname) {
		this.pname = pname;
	}

	/** full constructor */
	public Parent(String pname, Set<Sons> sonses) {
		this.pname = pname;
		this.sonses = sonses;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "pid", unique = true, nullable = false)
	public Integer getPid() {
		return this.pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	@Column(name = "pname", nullable = false, length = 10)
	public String getPname() {
		return this.pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "parent")
	public Set<Sons> getSonses() {
		return this.sonses;
	}

	public void setSonses(Set<Sons> sonses) {
		this.sonses = sonses;
	}

}
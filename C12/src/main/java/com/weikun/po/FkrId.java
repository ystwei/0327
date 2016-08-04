package com.weikun.po;

/**
 * FkrId entity. @author MyEclipse Persistence Tools
 */

public class FkrId implements java.io.Serializable {

	// Fields

	private String name;
	private String sex;

	// Constructors

	/** default constructor */
	public FkrId() {
	}

	/** full constructor */
	public FkrId(String name, String sex) {
		this.name = name;
		this.sex = sex;
	}

	// Property accessors

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof FkrId))
			return false;
		FkrId castOther = (FkrId) other;

		return ((this.getName() == castOther.getName()) || (this.getName() != null
				&& castOther.getName() != null && this.getName().equals(
				castOther.getName())))
				&& ((this.getSex() == castOther.getSex()) || (this.getSex() != null
						&& castOther.getSex() != null && this.getSex().equals(
						castOther.getSex())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getName() == null ? 0 : this.getName().hashCode());
		result = 37 * result
				+ (getSex() == null ? 0 : this.getSex().hashCode());
		return result;
	}

}
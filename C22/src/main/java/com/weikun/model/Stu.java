package com.weikun.model;

import java.util.List;

public class Stu {
    private Integer sid;
    private List<TeastuKey> klist;    
    

	public List<TeastuKey> getKlist() {
		return klist;
	}

	public void setKlist(List<TeastuKey> klist) {
		this.klist = klist;
	}

	private String sname;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }
}
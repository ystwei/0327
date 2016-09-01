package com.weikun.model;

import java.util.List;

public class Company {
    private Integer cid;
    private List<Emp> elist;
    
    public List<Emp> getElist() {
		return elist;
	}

	public void setElist(List<Emp> elist) {
		this.elist = elist;
	}

	private String cname;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }
}
package com.weikun.model;

import java.util.List;

public class Father {
    private Integer fid;
    private List <Sons> slist;
    
    public List<Sons> getSlist() {
		return slist;
	}

	public void setSlist(List<Sons> slist) {
		this.slist = slist;
	}

	private String fname;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname == null ? null : fname.trim();
    }
}
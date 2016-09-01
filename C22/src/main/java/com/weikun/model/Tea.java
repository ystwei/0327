package com.weikun.model;

import java.util.List;

public class Tea {
    private Integer tid;
    private List<TeastuKey> slist;
    
    public List<TeastuKey> getSlist() {
		return slist;
	}

	public void setSlist(List<TeastuKey> slist) {
		this.slist = slist;
	}

	private String tname;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname == null ? null : tname.trim();
    }
}
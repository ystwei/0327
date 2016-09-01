package com.weikun.model;

public class Sons {
    private Integer sid;
    private Father father;
    
    public Father getFather() {
		return father;
	}

	public void setFather(Father father) {
		this.father = father;
	}

	private Integer fid;

    private String sname;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }
}
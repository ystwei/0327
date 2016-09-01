package com.weikun.model;

public class Emp extends EmpKey {
    private String ename;

    public String getEname() {
        return ename;
    }

    public void setCname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }
}
package com.weikun.dao;

import java.util.List;

import com.weikun.po.Myuser;

public interface IUserDAO {
	public List<Myuser> queryAll();
	public boolean del(int id);
	public boolean addorupdate(Myuser user);
	public Myuser queryUserByid(int id);
}

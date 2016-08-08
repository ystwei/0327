package com.weikun.service;

import java.util.List;

import com.weikun.po.Myuser;

public interface IUserService {
	public List<Myuser> queryAll() ;
	public boolean del(int id) ;
	public boolean addorupdate(Myuser user) ;
	public Myuser queryUserByid(int id) ;
}

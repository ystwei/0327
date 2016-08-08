package com.weikun.service;

import java.util.List;

import com.weikun.dao.IUserDAO;
import com.weikun.dao.UserDAOImpl;
import com.weikun.po.Myuser;

public class UserServiceImpl implements IUserService {
	
	private IUserDAO dao=new UserDAOImpl(); 
	
	@Override
	public List<Myuser> queryAll() {
		// TODO Auto-generated method stub
		return dao.queryAll();
	}

	@Override
	public boolean del(int id) {
		// TODO Auto-generated method stub
		return dao.del(id);
	}

	@Override
	public boolean addorupdate(Myuser user) {
		// TODO Auto-generated method stub
		return dao.addorupdate(user);
	}

	@Override
	public Myuser queryUserByid(int id) {
		// TODO Auto-generated method stub
		return dao.queryUserByid(id);
	}

}

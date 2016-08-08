package com.weikun.dao;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.weikun.po.HibernateSessionFactory;
import com.weikun.po.Myuser;

public class UserDAOImpl implements IUserDAO {

	@Override
	public List<Myuser> queryAll() {
		// TODO Auto-generated method stub
		Session session=null;
		List<Myuser> list=null;
		try {
			session=HibernateSessionFactory.getSession();

			list=session.createQuery("from Myuser as m order by m.id desc").setCacheable(true).list();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			HibernateSessionFactory.closeSession();


		}
		return list;
	}

	@Override
	public boolean del(int id) {
		// TODO Auto-generated method stub
		Session session=null;

		Transaction trans=null;
		boolean flag=false;
		try {
			session=HibernateSessionFactory.getSession();
			trans=session.beginTransaction();

			Myuser user=(Myuser)session.load(Myuser.class, id);
			session.delete(user);
			trans.commit();

			flag=true;
		} catch (Exception e) {
			// TODO: handle exception
			trans.rollback();
			e.printStackTrace();
		}finally{

			HibernateSessionFactory.closeSession();
		}


		return flag;
	}

	@Override
	public boolean addorupdate(Myuser user) {
		// TODO Auto-generated method stub
		Session session=null;

		Transaction trans=null;
		boolean flag=false;
		try {
			session=HibernateSessionFactory.getSession();
			trans=session.beginTransaction();


			session.saveOrUpdate(user);
			trans.commit();

			flag=true;
		} catch (Exception e) {
			// TODO: handle exception
			trans.rollback();
			e.printStackTrace();
		}finally{

			HibernateSessionFactory.closeSession();
		}
		return flag;
	}

	@Override
	public Myuser queryUserByid(int id) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Session session=null;
		Myuser user=null;
		try {
			session=HibernateSessionFactory.getSession();

			user=(Myuser)session.load(Myuser.class, id);
			if(!Hibernate.isInitialized(user)){
				Hibernate.initialize(user);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			HibernateSessionFactory.closeSession();


		}
		return user;

	}

}

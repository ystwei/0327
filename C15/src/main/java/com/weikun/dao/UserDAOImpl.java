package com.weikun.dao;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.weikun.po.HibernateSessionFactory;
import com.weikun.po.Myuser;

public class UserDAOImpl implements IUserDAO {
	private SessionFactory sessionFactory;
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public List<Myuser> queryAll() {
		// TODO Auto-generated method stub
		Session session=null;
		List<Myuser> list=null;
		try {
			//session=HibernateSessionFactory.getSession();
			session=this.sessionFactory.openSession();

			list=session.createQuery("from Myuser as m order by m.id desc").setCacheable(true).list();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			session.flush();
			session.clear();
			session.close();


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
			session=this.sessionFactory.openSession();
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

			session.flush();
			session.clear();
			session.close();
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
			session=this.sessionFactory.openSession();
			trans=session.beginTransaction();


			session.saveOrUpdate(user);
			trans.commit();

			flag=true;
		} catch (Exception e) {
			// TODO: handle exception
			trans.rollback();
			e.printStackTrace();
		}finally{

			session.flush();
			session.clear();
			session.close();
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
			session=this.sessionFactory.openSession();
			user=(Myuser)session.load(Myuser.class, id);
			if(!Hibernate.isInitialized(user)){
				Hibernate.initialize(user);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			session.flush();
			session.clear();
			session.close();


		}
		return user;

	}

}

package com.weikun.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.weikun.po.HibernateSessionFactory;
import com.weikun.po.Myuser;

public class UserDAO {
	public static void main(String[] args) {
		new UserDAO().queryAll();
	}
	
	public void queryAll(){
		Session session=HibernateSessionFactory.getSession();
		
		try {
			Query q=session.createQuery("from Myuser as a where username=:p1");//HQL:Hibernate Query Language
			q.setParameter("p1", "林");
			List <Myuser>list=q.list();
			
			for(Myuser u :list){
				
				System.out.println(u.getUsername());
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			HibernateSessionFactory.closeSession();
		}
		
		
	}
	public void update(){
		Session session=HibernateSessionFactory.getSession();
		Transaction trans=null;
		try {
			trans=session.beginTransaction();
			
			
			Myuser user=(Myuser)session.load(Myuser.class, 10);
			user.setPwd("888");
			user.setUsername("卫叔叔");
			
			
			session.update(user);
			trans.commit();
		} catch (Exception e) {
			// TODO: handle exception
			trans.rollback();
			e.printStackTrace();
			
		}finally{
			HibernateSessionFactory.closeSession();
		}
		
		
	}
	public void del(){
		
		Session session=HibernateSessionFactory.getSession();
		Transaction trans=null;
		try {
			trans=session.beginTransaction();
			//get当没有找到记录的时候，他返回空
			//load 、、、、、、、、、、返回异常
			
			Myuser user=(Myuser)session.load(Myuser.class, 11);
			
			
			
			session.delete(user);
			trans.commit();
		} catch (Exception e) {
			// TODO: handle exception
			trans.rollback();
			e.printStackTrace();
			
		}finally{
			HibernateSessionFactory.closeSession();
		}
		
	}
	public void add(){
		Session session=HibernateSessionFactory.getSession();
		Transaction trans=null;
		try {
			trans=session.beginTransaction();
			Myuser user=new Myuser();
			user.setId(100);
			user.setUsername("哈尔滨");
			user.setPwd("999");
			session.save(user);
			//session.saveOrUpdate(user);
			trans.commit();
		} catch (Exception e) {
			// TODO: handle exception
			trans.rollback();
			e.printStackTrace();
			
		}finally{
			HibernateSessionFactory.closeSession();
		}
		
	}
}

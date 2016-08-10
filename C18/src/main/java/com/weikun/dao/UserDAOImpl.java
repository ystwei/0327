package com.weikun.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.weikun.po.Myuser;

public class UserDAOImpl implements IUserDAO {
	private SessionFactory sessionFactory;
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		IUserDAO dao=(UserDAOImpl)ctx.getBean("udao");
		dao.del();
		//dao.queryAll();
	}
	
	
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}



	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}



	public void queryAll() {
		
		
		try {
			Session session=this.sessionFactory.getCurrentSession();
		
			List<Myuser> list=session.createQuery("from Myuser as m").list();
			
					
			for(Myuser m :list){
				System.out.println(m.getUsername());
			}
			
			session.clear();
			session.flush();
			session.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public void update() {
		try {
			Session session=this.sessionFactory.openSession();
		
			Myuser user=(Myuser)session.get(Myuser.class, 108);
			user.setUsername("哈尔滨");
			
			
			session.update(user);
			
			session.clear();
			session.flush();
			session.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}
	public void del() {
//		try {
//			Session session=this.sessionFactory.openSession();
//		
//			Myuser user=(Myuser)session.get(Myuser.class, 108);
//			
//			
//			
//			session.delete(user);
//			
//			session.clear();
//			session.flush();
//			session.close();
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
		
		try {
			
			
			Session session = this.sessionFactory.openSession();
			Myuser user1=(Myuser)session.get(Myuser.class,105);


			session.delete(user1);
			session.flush();
			session.clear();
			session.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		Session session=this.sessionFactory.openSession();
		
		
		Myuser my=new Myuser();
		my.setUsername("JAJAJAJ");
		my.setPwd("8888");
		session.save(my);
		
		session.clear();
		session.flush();
		session.close();
	}

}

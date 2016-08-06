package com.weikun.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.weikun.po.HibernateSessionFactory;
import com.weikun.po.Stu;
import com.weikun.po.Tea;

public class TeaDAO {
	public static void main(String[] args) {
		new TeaDAO().del();
	}
	public void del(){
		Session session=HibernateSessionFactory.getSession();
		Transaction trans=session.beginTransaction();
		try {
			Tea t=(Tea)session.load(Tea.class, 3);
			
			session.delete(t);
			
			
			
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
		Transaction trans=session.beginTransaction();
		try {
			Tea t=new Tea();
			
			t.setTid(3);
			t.setTname("TOM");
			
			Tea t1=new Tea();
			
			t1.setTid(4);
			t1.setTname("NIKE");
			
			
			Stu s=new Stu();
			s.setSid(5);
			s.setSname("anna");
			
			Stu s1=new Stu();
			s1.setSid(6);
			s1.setSname("alisha");
			
			t.getStus().add(s);
			s.getTeas().add(t);
			t.getStus().add(s1);
			s1.getTeas().add(t);
			
			
			
			t1.getStus().add(s);
			s.getTeas().add(t1);
			t1.getStus().add(s1);
			s1.getTeas().add(t1);
			
			session.save(t);
			session.save(t1);
			
			
			
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

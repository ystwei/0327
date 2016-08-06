package com.weikun.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.weikun.po.Fkr;
import com.weikun.po.FkrId;
import com.weikun.po.HibernateSessionFactory;
import com.weikun.po.Hus;
import com.weikun.po.Wife;

public class HusDAO {
	public static void main(String[] args) {
		new HusDAO().queryAll();
	}
	
	public void queryAll(){
		Session session=HibernateSessionFactory.getSession();
		
		
		try {			
			
			Query q=session.createQuery("from Hus as h order by id desc");			
			List<Hus> list=q.list();			
			for(Hus h :list){
				System.out.println(h.getHname()+"--"+h.getWife().getWname());				
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
			
			Hus hus=(Hus)session.load(Hus.class, 2);
			
			hus.setHname("PHP");
			
			hus.getWife().setWname("LUA");
			
			session.update(hus);
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
			
			Hus hus=(Hus)session.load(Hus.class, 1);
			
			
			
			session.delete(hus);
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
			
			Hus h=new Hus();
			h.setId(9);
			h.setHname("JAVA");
			
			Wife w=new Wife();
			
			w.setId(9);
			w.setWname("C++");
			
			h.setWife(w);
			w.setHus(h);
			
			session.save(h);
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

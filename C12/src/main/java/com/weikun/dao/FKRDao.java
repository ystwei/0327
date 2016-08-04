package com.weikun.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.weikun.po.Fkr;
import com.weikun.po.FkrId;
import com.weikun.po.HibernateSessionFactory;

public class FKRDao {
	public static void main(String[] args) {
		new FKRDao().update();
	}
	public void update(){
		Session session=HibernateSessionFactory.getSession();
		
		Transaction trans=null;
		try {
			trans=session.beginTransaction();
			
			FkrId id=new FkrId();
			id.setSex("女");
			id.setName("哈尔滨");
			Fkr f=(Fkr)session.load(Fkr.class, id);
			f.setOld(900);
			session.update(f);
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
			
			FkrId id=new FkrId();
			id.setSex("男");
			id.setName("哈尔滨");
			Fkr f=(Fkr)session.load(Fkr.class, id);
			
			session.delete(f);
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
			
			Fkr fkr=new Fkr();
			
			fkr.setOld(100);
			
			FkrId id=new FkrId();
			id.setName("哈尔滨");
			id.setSex("女");
			fkr.setId(id);
			
			session.save(fkr);
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

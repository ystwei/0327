package com.weikun.po;

import java.util.Iterator;
import java.util.Set;

import org.hibernate.Hibernate;
import org.hibernate.Session;

public class MyDAO {
	public static void main(String[] args) {
		MyDAO m=new MyDAO();
		Parent p=m.queryAll();
		
		
		Set<Sons> s=p.getSonses();
//		
		Iterator<Sons> it=s.iterator();
		
		while(it.hasNext()){
			System.out.print(it.next().getSname());
		}
		
	}
	public Parent queryAll(){		
		Session session=HibernateSessionFactory.getSession();
		Parent p =null;
		try {
			
			p=(Parent)session.load(Parent.class, 1);
			//懒加载下 让他随时使用的语句
			if(!Hibernate.isInitialized(p.getSonses())){
				
				Hibernate.initialize(p.getSonses());
				
			}
			
//			Set<Sons> s=p.getSonses();
//			
//			Iterator<Sons> it=s.iterator();
//			
//			while(it.hasNext()){
//				System.out.print(it.next().getSname());
//			}
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			HibernateSessionFactory.closeSession();
		}
		return p;
	}

}

package com.weikun.dao;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.weikun.po.HibernateSessionFactory;
import com.weikun.po.Parent;
import com.weikun.po.Sons;

public class ParentDAO {
	public static void main(String[] args) {
		new ParentDAO().selectAll();
	}
	public void selectAll(){
		Session session=HibernateSessionFactory.getSession();
		
		try {
			
			Query q=session.createQuery("from Parent as p  ");
			
			List<Parent> list=q.list();
			
			for(Parent p :list){
				System.out.println(p.getPname());
				
				Set<Sons> s=p.getSonses();
				
				Iterator<Sons> it=s.iterator();
				while(it.hasNext()){
					System.out.println(it.next().getSname());
			
				}
				
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
			
			
			Parent p=(Parent)session.get(Parent.class, 4);
			p.setPname("PHP");
			
			((Sons)(p.getSonses().toArray()[0])).setSname("LUA");
			session.update(p);
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
			//删除从表
//			Sons s=(Sons)session.get(Sons.class, 4);
//			session.delete(s);
			
			Parent p=(Parent)session.get(Parent.class, 3);
			session.delete(p);
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
			Parent p=new Parent();
			p.setPname("JAVA");
			
			Sons s=new Sons();
			s.setSname("C++");
			s.setParent(p);
			p.getSonses().add(s);
			
			
			
			Sons s1=new Sons();
			s1.setSname("RUBY");
			s1.setParent(p);
			p.getSonses().add(s1);
			
			session.save(p);
			
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

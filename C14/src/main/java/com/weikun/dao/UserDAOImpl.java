package com.weikun.dao;

import java.util.Iterator;
import java.util.List;

import javax.persistence.ParameterMode;

import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.procedure.ProcedureCall;
import org.hibernate.result.Output;
import org.hibernate.result.ResultSetOutput;

import com.weikun.po.HibernateSessionFactory;
import com.weikun.po.Myuser;
import com.weikun.po.Parent;

public class UserDAOImpl implements IUserDAO {
	
	
	
	public static void main(String[] args) {
		UserDAOImpl u=new UserDAOImpl();
		u.queryAllByPro();


	}
	
//	drop procedure  if  exists p_2;
//	DELIMITER $
//	create procedure p_2(
//		in in_username varchar(10) character set utf8,
//		out out_result varchar(10)
//	)
//	begin
//
//		select * from myuser
//		where username like in_username;
//		set out_result:="ok";
//
//	end $
//	DELIMITER ;
	
	
	
	public void queryAllByPro() {
		
		Session session=HibernateSessionFactory.getSession();
		ProcedureCall call=session.createStoredProcedureCall("p_2");
		//输入输出参数的顺序 他妈的一定是存储过程的顺序 ，不能错，太恶了
		call.registerParameter("out_result", String.class,ParameterMode.OUT);
		call.registerParameter("in_username", String.class,ParameterMode.IN ).bindValue("哈%");
		
		call.registerParameter("out_result1", String.class,ParameterMode.OUT);
		String result=call.getOutputs().getOutputParameterValue("out_result").toString();
		String result1=call.getOutputs().getOutputParameterValue("out_result1").toString();
		
		System.out.println("--->"+result);
		System.out.println("--->"+result1);
      //  
		ResultSetOutput o=(ResultSetOutput)call.getOutputs().getCurrent();
		
        
        List list = o.getResultList();
        
        
        for(int i=0;i<list.size();i++){
        	
        	  Object[] os=(Object[])list.get(i);
        	  
        	  for(Object o1 :os){
              	
              	System.out.print(o1);
              }
        	  System.out.println();
        }
      
        
        
      //List<Myuser> list=session.getNamedQuery("p_2").list();
       

		
		//Query q=session.getNamedQuery("p_2");
		
//		q.setString(0, "哈%");
//		List<Myuser> list=q.list();
//		Iterator<Myuser> it=list.iterator();		
//		while(it.hasNext()){
//			System.out.println(it.next().getUsername());
//		}		
		HibernateSessionFactory.closeSession();		
	}
	@Override
	public void queryAll() {
		// TODO Auto-generated method stub
		Session session=HibernateSessionFactory.getSession();
		try {			
			List<Parent> list=session.createQuery("from Parent as a").setCacheable(true).list();

			Iterator<Parent> it=list.iterator();
			while(it.hasNext()){
				System.out.println(it.next().getPname());
			}
			List<Parent> list1=session.createQuery("from Parent as a").setLockMode("a", LockMode.UPGRADE).setCacheable(true).list();
			Iterator<Parent> it1=list1.iterator();
			while(it1.hasNext()){
				System.out.println(it1.next().getPname());
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{			
			HibernateSessionFactory.closeSession();
		}
	}
	@Override
	public void add() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Session session=HibernateSessionFactory.getSession();
		try {	
			
			

		}catch(Exception e){
			e.printStackTrace();
		}finally{
			HibernateSessionFactory.closeSession();
			
		}
	}

}

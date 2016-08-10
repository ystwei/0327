package com.weikun.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;







import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class UserDAOImpl extends JdbcDaoSupport implements IUserDAO {
	
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		IUserDAO dao=(UserDAOImpl)ctx.getBean("udao");;
		
		dao.query2();
	}
	public void query2(){
		List <String>list=this.getJdbcTemplate().query("select * from myuser", new RowMapper<String>(){

			@Override
			public String mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				
				String result=rs.getString("username")+"----"+rs.getString("pwd");
				return result;
			}

			
			
		});
		
		for(String s :list){
			System.out.println(s);
		}
	}
	public void query1(){
		Map<String,Object> m=this.getJdbcTemplate().queryForMap("select * from myuser where id=?", 105);
		System.out.println(m.get("username"));
		
	}
	public void query(){
		
		List<Map<String,Object>> list=this.getJdbcTemplate().queryForList("select * from myuser where id=105");
		
		Iterator <Map<String,Object>> it=list.iterator();
		
		while(it.hasNext()){
			Map<String,Object> m=it.next();
			Set <Entry<String,Object>>s=m.entrySet();
			
			Iterator <Entry<String,Object>> it1=s.iterator();
			
			while(it1.hasNext()){
				Entry<String,Object> e=it1.next();
				System.out.println(e.getKey()+"---"+e.getValue());
			}
			
		}
		
	}
	public void update(){
		this.getJdbcTemplate().update("update myuser set username=?,pwd=? where id=?",new PreparedStatementSetter(){

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				// TODO Auto-generated method stub
				ps.setString(1, "卫先生");
				ps.setString(2, "1111");				
				ps.setInt(3, 105);				
			}
			
			
			
		});
	}
	
	public void del(){
		this.getJdbcTemplate().update("delete from myuser where id=?",new PreparedStatementSetter(){

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				// TODO Auto-generated method stub
				ps.setInt(1, 106);
				
			}
			
			
			
		});
	}
	public void add1(){
		
		this.getJdbcTemplate().update("insert into myuser(username,pwd) values(?,?)",new PreparedStatementSetter(){

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				// TODO Auto-generated method stub
				ps.setString(1, "冯先生");
				ps.setString(2, "999");
			}
			
			
			
		});
	}
	public void add(){
		Object[] os=new Object[]{"姜傲","88888"};
		int [] is=new int[]{Types.VARCHAR,Types.VARCHAR};
		System.out.print(this.getJdbcTemplate().update("insert into myuser(username,pwd) values(?,?)",
				os, is)>0?true:false);
		
	}
}

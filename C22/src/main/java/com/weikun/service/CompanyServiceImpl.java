package com.weikun.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.weikun.model.Company;
import com.weikun.model.CompanyExample;
import com.weikun.model.Emp;

public class CompanyServiceImpl implements ICompanyService {
	
	private SqlSessionFactory ssf;
	private SqlSession ss;
	public CompanyServiceImpl(){
		
		InputStream is;
		try {
			is = new FileInputStream(new File(FatherServiceImpl.class.getClassLoader().getResource("").getPath()+"mybatis.cfg.xml"));
			
			
			ssf=new SqlSessionFactoryBuilder().build(is);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	public static void main(String[] args) {
		new CompanyServiceImpl().selectByExample(null);
	}
	@Override
	public List<Company> selectByExample(CompanyExample example) {
		// TODO Auto-generated method stub
		ss=ssf.openSession();
		
		List <Company>list=ss.selectList("com.weikun.dao.CompanyMapper.selectAll");
		
		for(Company c :list){
			
			System.out.println("-----"+c.getCname());
			
			
			List <Emp> elist=c.getElist();
					
			for(Emp e :elist){
				System.out.println("--->"+e.getEname());
			}
		}
		
		ss.close();
		
		
		return null;
	}

}
